package com.online.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.exam.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Long>{

	
	
}
