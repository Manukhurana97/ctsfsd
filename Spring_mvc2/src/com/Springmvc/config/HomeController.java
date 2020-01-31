package com.Springmvc.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Springmvc.model.User;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("user", new User());
		
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.POST,path = "/processLogin")
	public String processLogin(@ModelAttribute("user") User user)
	{
		System.out.println(user.getUserid());
		if((user.getUserid().equals("admin@email.com")) &&(user.getPassword().equals("admin"))) 
		{
			return "sucess";
		}
		else
		{
			return "error";
		}
		
	}
	
	

}
