package com.online.exam.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exam", schema = "exam_portal")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "duration", nullable = false)
	private int duration;

	@Column(name = "start_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime startTime;

	@Column(name = "end_time", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime endTime;

	}


