package com.swati.quizquestions.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Component
@Table(name="result1")
public class Result {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int result;
	@Column(name="user_name")
private String username;
	private int total_wrong;
	private int total_correct;
	private int number_of_questions_attempted;
	public int getTotal_wrong() {
		return total_wrong;
	}
	public void setTotal_wrong(int total_wrong) {
		this.total_wrong = total_wrong;
	}
	public int getTotal_correct() {
		return total_correct;
	}
	public void setTotal_correct(int total_correct) {
		this.total_correct = total_correct;
	}
	public int getNumber_of_questions_attempted() {
		return number_of_questions_attempted;
	}
	public void setNumber_of_questions_attempted(int number_of_questions_attempted) {
		this.number_of_questions_attempted = number_of_questions_attempted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", result=" + result + ", username=" + username + ", total_wrong=" + total_wrong
				+ ", total_correct=" + total_correct + ", number_of_questions_attempted="
				+ number_of_questions_attempted + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
