package com.tonigdev.portfolio.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tonigdev.portfolio.model.entities.ExternalLink;
import com.tonigdev.portfolio.model.entities.Profile;
import com.tonigdev.portfolio.model.entities.SkillUser;
import com.tonigdev.portfolio.model.entities.Technology;
import com.tonigdev.portfolio.model.entities.TechnologyType;
import com.tonigdev.portfolio.model.entities.User;
import com.tonigdev.portfolio.model.entities.UserTechnology;
import com.tonigdev.portfolio.services.externallink.ExternalLinkService;
import com.tonigdev.portfolio.services.profile.ProfileService;
import com.tonigdev.portfolio.services.skilluser.SkillUserService;
import com.tonigdev.portfolio.services.technologytype.TechnologyTypeService;
import com.tonigdev.portfolio.services.user.UserService;
import com.tonigdev.portfolio.services.usertechnology.UserTechnologyService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/about")
public class AboutController {
	
	private final UserService userService;
	private final ProfileService profileService;
	private final ExternalLinkService externalLinkService;
	private final SkillUserService skillUserService;
	private final UserTechnologyService userTechnologyService;
	private final TechnologyTypeService technologyTypeService;
	
	@GetMapping
	public String about(Model model) {
		User user = userService.getUser().get();
		Profile profile = profileService.findByUserId(user.getId()).get();
		List<ExternalLink> links = externalLinkService.findByUserId(user.getId());
		List<SkillUser> skills = skillUserService.findByUserId(user.getId());
		HashMap<TechnologyType, List<Technology>> mapUserTechnologies = new LinkedHashMap();
		List<TechnologyType> techTypes = technologyTypeService.findByUserId(user.getId());
		List<UserTechnology> userTechnologies = userTechnologyService.findByUserId(user.getId());
		
		for(TechnologyType type: techTypes) {
			List<Technology> techns = new ArrayList<>();
			for(UserTechnology userTech: userTechnologies) {
				if(userTech.getTechnology().getTechnologyType().getId() == type.getId()) {
					techns.add(userTech.getTechnology());
				}
			}
			mapUserTechnologies.put(type, techns);
		}
		
		mapUserTechnologies.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(TechnologyType::getName)))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		model.addAttribute("currentPage", "about");
		model.addAttribute("user", user);
		model.addAttribute("profile", profile);
		model.addAttribute("links", links);
		model.addAttribute("skillsUser", skills);
		model.addAttribute("mapUserTechnologies", mapUserTechnologies);
		
		return "about";
	}
}
