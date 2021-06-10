package com.swati.quizquestions.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.swati.quizquestions.entities.QuestionForm;
import com.swati.quizquestions.entities.Questions;
import com.swati.quizquestions.entities.Result;
import com.swati.quizquestions.repositories.Questionrepos;
import com.swati.quizquestions.repositories.Resultrepos;
import com.swati.quizquestions.service.QuizService;

@Controller
public class MainController {
	@Autowired
	Result result;
	@Autowired
	QuizService qService;
	@Autowired
	Questionrepos qrepos;
    @Autowired
	QuestionForm qform2;
    @Autowired
    Result result2;
    @Autowired
    Resultrepos res_repos;
    int id1;
    List<Questions> qform3=new ArrayList<Questions>();

	//(@ModelAttribute QuestionForm qForm,ModelMap map

	@RequestMapping("/submit")
	public String displaysolution(@ModelAttribute QuestionForm qForm, ModelMap map  ) {
		result.setResult(qService.getResult(qForm));
	     result.setTotal_wrong(qService.getWrongresult(qForm));
	     result.setTotal_correct(qService.getResult(qForm));
	     result.setNumber_of_questions_attempted(qService.number_of_questions_attempted(qForm));
      Result result1 =qService.saveScore(result);
	  getid(result1);
		qform3=qService.setQuestions1(qForm);
	map.addAttribute("qform3",qform3); 
	return "htmls/questionanswer";
	}  

	@RequestMapping(value="/result", method=RequestMethod.GET)
	public String displayScore(ModelMap map) {
		
		Result result3=res_repos.findById(id1).orElse(null);
	   System.out.println("result 3" +  result3.getTotal_correct());
	   
	map.addAttribute("result3", result3);
	return "htmls/Resultpage";
	}
	public void getid(Result result) {
       
		id1=result.getId();
		System.out.println("id detail" + id1);


	}
	
	
	
	
}
