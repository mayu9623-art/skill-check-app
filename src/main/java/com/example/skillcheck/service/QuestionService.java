package com.example.skillcheck.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.skillcheck.entity.Question;
import com.example.skillcheck.mapper.QuestionMapper;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper mapper;

    public List<Question> findAll() {
        return mapper.findAll();
    }
}