package com.swati.quizquestions.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.swati.quizquestions.entities.QuestionForm;
import com.swati.quizquestions.entities.Questions;
import com.swati.quizquestions.entities.Result;
import com.swati.quizquestions.repositories.Questionrepos;

import com.swati.quizquestions.repositories.Resultrepos;

@Service
public class QuizService {
	@Autowired
	Questions question;
	@Autowired
	QuestionForm questionForm;
	@Autowired
	Questionrepos questionrepos;
	@Autowired
	Result result;
	@Autowired
	 Resultrepos rRepo;

	
	public QuestionForm getQuestions() {
		List<Questions> allQues = questionrepos.findAll();
		List<Questions> questionList = new ArrayList<Questions>();
		
		Random random = new Random();
		
		for(int i=1; i<7; i++) {
			int rand = random.nextInt(allQues.size());
			questionList.add(allQues.get(rand));
			  
			allQues.remove(rand);
		}

		questionForm.setQuestion(questionList);
		
		return questionForm;
	}
	
	public int getResult(QuestionForm qForm) {
		int correct = 0;
		for(Questions q: qForm.getQuestion()) {
			
			if(q.getChosen_answer()==q.getCorrect_answer()) {
				correct++;
	}}
		return correct;
	}
	public int getWrongresult(QuestionForm  qForm) {
	int wrong=0;
	for(Questions q: qForm.getQuestion()) {
	   
		if(q.getChosen_answer()!=q.getCorrect_answer()) {
	
		wrong++;
}
	} System.out.println("wrongs" +wrong  );
	return wrong;
	}
	public int number_of_questions_attempted(QuestionForm  qForm) {
int count=0;   
   for(Questions q1:qForm.getQuestion()) {
	if(q1.getChosen_answer()!=-1) {
			          count++;
		}}  
		return count;
	}
	public Result saveScore(Result result) {
		Result saveResult = new Result();
		saveResult.setUsername(result.getUsername());
		saveResult.setTotal_correct(result.getTotal_correct());
		saveResult.setTotal_wrong(result.getTotal_wrong());
		saveResult.setNumber_of_questions_attempted(result.getNumber_of_questions_attempted());
		Result savedresult=rRepo.save(saveResult);
		return savedresult;
	}
	
	//public List<Result> getTopScore() {
	//	List<Result> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
		
		//return sList;
	//}

	public void printlist(List<Questions> qlist) {
		
		qlist.forEach(e->{System.out.println("helloww workd" + e);});
	}
	public List<Questions> setQuestions1(QuestionForm qform) {
	
	List<Questions> questionList = new ArrayList<Questions>();
		for(Questions q1: qform.getQuestion()) {
			
			question.setQuestion(q1.getQuestion());
			question.setId(q1.getId());
			question.setComment(q1.getComment());
			question.setChosen_answer(q1.getChosen_answer());
			Questions q8=setchoices(q1);
		
			question.setChoice1(q8.getChoice1());
	        question.setChoice2(q8.getChoice2());
			question.setChoice3(q8.getChoice3());
			question.setChoice4(q8.getChoice4());
			question.setCorrect_answer(q8.getCorrect_answer());
			questionList.add(question);
			
		} 
		printlist(questionList);

		
		return questionList;
	}
	public Questions setchoices(Questions q){
		Long id=q.getId();
		Questions q7 = questionrepos.findById(id).orElse(null);
	return q7;
}

	
	
}
