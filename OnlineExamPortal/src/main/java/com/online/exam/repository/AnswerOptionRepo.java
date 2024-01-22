package com.online.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.exam.entity.AnswerOption;

public interface AnswerOptionRepo extends JpaRepository<AnswerOption, Long>{

}
