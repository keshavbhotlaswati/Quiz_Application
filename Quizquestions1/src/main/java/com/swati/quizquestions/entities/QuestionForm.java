package com.swati.quizquestions.entities;

import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class QuestionForm {
private List<Questions> question;

public List<Questions> getQuestion() {
	return question;
}

public void setQuestion(List<Questions> question) {
	this.question = question;
}

}
