package com.online.exam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "exam", schema = "answer")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "text")
	private String text;

	@Column(name = "student_response")
	private String studentResponse;

	@ManyToOne
	@JoinColumn(name = "question_id", nullable = false)
	private Questions question;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private Users user;

	@ManyToOne
	@JoinColumn(name = "option_id")
	private AnswerOption option;

}
