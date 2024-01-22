package com.online.exam.dao;

import com.online.exam.entity.Exam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionsDao {

	private Long id;

	private String text;

	private String questionType;

	private Exam exam;
	
}
