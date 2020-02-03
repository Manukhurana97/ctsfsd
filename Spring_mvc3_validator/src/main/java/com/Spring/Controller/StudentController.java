package com.Spring.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StudentController {
	@RequestMapping(method = RequestMethod.POST,path=" /studentshowForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("student") Student theStudent,BindingResult theResult) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName()
							+ " " + theStudent.getLastName());
		
		if(theResult.hasErrors())
		{
			return "student-form";
		}
		return "student-confirmation";
	}
}
