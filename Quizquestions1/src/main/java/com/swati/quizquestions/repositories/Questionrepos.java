package com.swati.quizquestions.repositories;




import org.springframework.data.jpa.repository.JpaRepository;


import com.swati.quizquestions.entities.Questions;

public interface Questionrepos extends JpaRepository<Questions, Long> {

}
