package com.codingdojo.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dojosurvey {
	public String name, location,language, comment;
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/result")
	public String PostResult(
			@RequestParam(value= "name", required = false) String name,
			@RequestParam(value= "location", required = false) String location,
			@RequestParam(value= "language", required = false) String language,
			@RequestParam(value= "comment", required = true) String comment
			) {
		this.name = name;
		this.location = location;
		this.language = language;
		this.comment = comment;
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String GetResult(Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment",comment);
		
		return "result.jsp";
	}
	

	

}
