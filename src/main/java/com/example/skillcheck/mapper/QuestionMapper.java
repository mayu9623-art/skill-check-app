package com.example.skillcheck.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.skillcheck.entity.Question;

@Mapper
public interface QuestionMapper {
    List<Question> findAll();
}