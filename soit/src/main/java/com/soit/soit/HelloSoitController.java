package com.soit.soit;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloSoitController {

// Controller method to view the form 
	@RequestMapping("/viewForm")
	public String viewForm() {
		return "hellosoitform";
		
	}
	
	//Controller method to process the form
	@RequestMapping("/processForm")
	public String processForm(
	@RequestParam ("faculyName") String Name, Model model) {
		
	//Read the request parameter from the HTML form
	//Converts the message
	Name = Name.toUpperCase();
	
	//Creates the message
	String result = "Hello Professor! " + Name;
	
	//Add message to result
	model.addAttribute("message", result);
		
		
		return "hellosoit";
	}
	
}
