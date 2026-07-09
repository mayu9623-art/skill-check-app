package com.example.skillcheck.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.skillcheck.entity.Question;
import com.example.skillcheck.service.QuestionService;

@Controller
public class QuizController {

    @Autowired
    private QuestionService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/quiz")
    public String quiz(Model model) {
        model.addAttribute("questions", service.findAll());
        return "quiz";
    }

    @PostMapping("/result")
    public String result(@RequestParam Map<String,String> answers,
                         Model model) {

        int score = 0;
        List<Question> list = service.findAll();

        for (Question q : list) {
            String ans = answers.get("q" + q.getId());

            if (ans != null &&
                Integer.parseInt(ans) == q.getAnswer()) {
                score++;
            }
        }

        model.addAttribute("score", score);
        model.addAttribute("total", list.size());

        return "result";
    }
}