package com.swati.quizquestions.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swati.quizquestions.entities.Result;


public interface Resultrepos extends JpaRepository<Result, Integer> {

	
	
}
