package com.online.exam.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDao {

	private Long id;

	private String username;

	private String password;

	private String email;

	private String role;

}
