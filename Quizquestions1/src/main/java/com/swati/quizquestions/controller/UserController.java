package com.swati.quizquestions.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swati.quizquestions.entities.QuestionForm;
import com.swati.quizquestions.entities.Result;
import com.swati.quizquestions.entities.User;
import com.swati.quizquestions.repositories.Resultrepos;
import com.swati.quizquestions.repositories.UserRepository;
import com.swati.quizquestions.service.QuizService;



@Controller
public class UserController {
	@Autowired
	private UserRepository user1;
	@Autowired
	private QuizService qservice;
	@Autowired
	private Result result;
	@Autowired
	Resultrepos res_repos;
	
int id1;
	@RequestMapping("/home")
	public String indexpage( ) {
		
		  
		return "index";
	}
	@RequestMapping("/showReg")
public String showRegistrationPage() {
		
	return "htmls/registerUser";
}
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String register(@ModelAttribute("user")User user,ModelMap map) {
		
		if(user.getEmail()==null || user.getFirstName()==null || user.getLastName()==null ||user.getPassword()==null) {
		map.addAttribute("msg","Kindly fill all the details");	
			return "htmls/registerUser";
		}
		else {
	user1.save(user);}
		
	return "htmls/login";
	}
	
	
	@RequestMapping("/showlogin")
public String showloginPage(){
	
	return "htmls/login";
}
	

	@RequestMapping(value="login" ,method=RequestMethod.POST )
	public String login(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap map){
		
			if(email.isEmpty() || password.isEmpty()) {
				map.addAttribute("msg", "Kindly enter the data in the fields");
				return "htmls/login";
			}
		User user=user1.findByEmail(email);
	if(user.getEmail().equals(email) 
			&& user.getPassword().equals(password)) {
		result.setUsername(user.getFirstName());
	   
		res_repos.save(result);
		QuestionForm qForm = qservice.getQuestions();
	      
		map.addAttribute("qForm", qForm);
		return "htmls/quizetime";
	}
	else { map.addAttribute("msg", "incorrect username or password please check once .");
	
	return "htmls/login";}
	
	}
	

} 
