package com.online.exam.dao;

import com.online.exam.entity.AnswerOption;
import com.online.exam.entity.Questions;
import com.online.exam.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDao {

	private Long id;

	private String text;

	private String studentResponse;

	private Questions question;

	private Users user;

	private AnswerOption option;

}
