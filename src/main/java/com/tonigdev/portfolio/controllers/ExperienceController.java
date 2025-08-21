package com.tonigdev.portfolio.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tonigdev.portfolio.model.entities.Education;
import com.tonigdev.portfolio.model.entities.Experience;
import com.tonigdev.portfolio.model.entities.ExternalLink;
import com.tonigdev.portfolio.model.entities.Profile;
import com.tonigdev.portfolio.model.entities.User;
import com.tonigdev.portfolio.services.education.EducationService;
import com.tonigdev.portfolio.services.experience.ExperienceService;
import com.tonigdev.portfolio.services.externallink.ExternalLinkService;
import com.tonigdev.portfolio.services.profile.ProfileService;
import com.tonigdev.portfolio.services.user.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cv")
public class ExperienceController {
	
	private final UserService userService;
	private final ProfileService profileService;
	private final ExternalLinkService externalLinkService;
	private final ExperienceService experienceService;
	private final EducationService educationService;

	@GetMapping
	public String experience(Model model) {
		User user = userService.getUser().get();
		Profile profile = profileService.findByUserId(user.getId()).get();
		List<ExternalLink> links = externalLinkService.findByUserId(user.getId());
		List<Education> educations = educationService.findByUserId(user.getId());
		List<Experience> experiences = experienceService.findByUserId(user.getId());
		
		model.addAttribute("currentPage", "experience");
		model.addAttribute("user", user);
		model.addAttribute("profile", profile);
		model.addAttribute("links", links);
		model.addAttribute("educations", educations);
		model.addAttribute("experiences", experiences);
		return "experience";
	}
	
}
