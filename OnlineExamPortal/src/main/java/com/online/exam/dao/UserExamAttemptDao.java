package com.online.exam.dao;

import java.time.LocalDateTime;

import com.online.exam.entity.Exam;
import com.online.exam.entity.Users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserExamAttemptDao {

	private Long id;

	private Users user;

	private Exam exam;

	private LocalDateTime startTime;

	private LocalDateTime endTime;

	private int score;

}
