package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BonsGrosController {	
	@RequestMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("hello", "Hello Spring MVC !");
		return "hello";
	}
	
//	@RequestMapping("/")
//	public String homepage(Model model) {
//		return "home";
//	}

}
