package com.swati.quizquestions.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="question")
public class Questions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String question;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private int correct_answer;
	private int chosen_answer;
	private String comment;
	public String getChoice1() {
		return choice1;
	}

	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", choice1=" + choice1 + ", choice2=" + choice2
				+ ", choice3=" + choice3 + ", choice4=" + choice4 + ", correct_answer=" + correct_answer
				+ ", chosen_answer=" + chosen_answer + ", comment=" + comment + "]";
	}

	public String getChoice2() {
		return choice2;
	}

	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}

	public String getChoice3() {
		return choice3;
	}

	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}

	public String getChoice4() {
		return choice4;
	}

	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}

	public int getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(int correct_answer) {
		this.correct_answer = correct_answer;
	}

	public int getChosen_answer() {
		return chosen_answer;
	}

	public void setChosen_answer(int chosen_answer) {
		this.chosen_answer = chosen_answer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	  
	
	
}
