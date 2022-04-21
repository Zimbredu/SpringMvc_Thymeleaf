package com.br.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
//	public String hello(HttpServletRequest request) {
//		request.setAttribute("nome", "Mundo");//nome->nome do atributo, Mundo->valor do atributo.
//		return "hello";
//	}
	
	public String hello(Model model) {
		model.addAttribute("nome", "Mundo");//nome->nome do atributo, Mundo->valor do atributo.
		return "hello";
	}


}