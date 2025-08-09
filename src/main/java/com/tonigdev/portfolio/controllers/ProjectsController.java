package com.tonigdev.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/projects")
public class ProjectsController {

	@GetMapping
	public String projects(Model model) {
		model.addAttribute("currentPage", "projects");
		return "projects";
	}
}
