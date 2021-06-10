package com.swati.quizquestions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.quizquestions.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);

}
