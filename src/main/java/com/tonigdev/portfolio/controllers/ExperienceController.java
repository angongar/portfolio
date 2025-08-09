package com.tonigdev.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cv")
public class ExperienceController {

	@GetMapping
	public String experience(Model model) {
		model.addAttribute("currentPage", "experience");
		return "experience";
	}
	
}
