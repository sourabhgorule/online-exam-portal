package com.online.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.exam.entity.UserExamAttempt;

@Repository
public interface UserExamAttemptRepo extends JpaRepository<UserExamAttempt, Long>{

}
