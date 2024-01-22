package com.online.exam.dao;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExamDao {

	private Long id;

	private String title;

	private String description;

	private int duration;

	private LocalDateTime startTime;

	private LocalDateTime endTime;
	
}
