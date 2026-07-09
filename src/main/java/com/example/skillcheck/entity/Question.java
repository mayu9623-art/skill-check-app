package com.example.skillcheck.entity;

import lombok.Data;

@Data
public class Question {

    private Integer id;
    private String question;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private Integer answer;
}