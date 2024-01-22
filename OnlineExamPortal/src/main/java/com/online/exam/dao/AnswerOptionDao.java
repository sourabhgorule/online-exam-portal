package com.online.exam.dao;

import com.online.exam.entity.Questions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerOptionDao {

	private Long id;

	private String text;

	private boolean isCorrect;

	private Questions question;

}
