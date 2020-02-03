package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class Studentcontroller {
	
	
		@RequestMapping("/showForm")
		public String show_form()
		{
			return "student-form";
		}
		
		@RequestMapping("/processForm")
		public String processForm(HttpServletRequest req, Model model)
		{
			String stuname = req.getParameter("sname");
			model.addAttribute("data",stuname);
			
			return "showdata";
		}


}
