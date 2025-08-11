package com.tonigdev.portfolio.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tonigdev.portfolio.model.dtos.ContactDto;
import com.tonigdev.portfolio.model.entities.ExternalLink;
import com.tonigdev.portfolio.model.entities.Profile;
import com.tonigdev.portfolio.model.entities.User;
import com.tonigdev.portfolio.services.externallink.ExternalLinkService;
import com.tonigdev.portfolio.services.mail.SendMailService;
import com.tonigdev.portfolio.services.profile.ProfileService;
import com.tonigdev.portfolio.services.user.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/contact")
public class ContactController {
	
	private final UserService userService;
	private final ProfileService profileService;
	private final ExternalLinkService externalLinkService;
	private final SendMailService sendMailService; 
	
	@GetMapping("")
	public String contact(Model model) {
		User user = userService.getUser().get();
		Profile profile = profileService.findByUserId(user.getId()).get();
		List<ExternalLink> links = externalLinkService.findByUserId(user.getId());
		
		model.addAttribute("contactDto", new ContactDto());
		model.addAttribute("currentPage", "contact");
		model.addAttribute("user", user);
		model.addAttribute("profile", profile);
		model.addAttribute("links", links);
		
		return "contact";
	}
	
	@PostMapping("")
	public String handleSend(@Valid @ModelAttribute ContactDto contactDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
		User user = userService.getUser().get();
		Profile profile = profileService.findByUserId(user.getId()).get();
		List<ExternalLink> links = externalLinkService.findByUserId(user.getId());
		
		model.addAttribute("currentPage", "contact");
		model.addAttribute("user", user);
		model.addAttribute("profile", profile);
		model.addAttribute("links", links);
		
		if(bindingResult.hasErrors()) {
			return "contact";
		}
		
		// TODO - Necesitamos una clase de constantes generales.
		String content = "¡" + contactDto.getName() + " (" + contactDto.getEmail() + ") quiere ponerse en contacto contigo desde el portfolio!\n\n" + contactDto.getMessage();
		
		sendMailService.sendMail(contactDto.getEmail(), contactDto.getSubject(), content);
		
		redirectAttributes.addFlashAttribute("successMessage", "Gracias por ponerse en contacto conmigo. Intentaré responder con la mayor brevedad posible.");
		return "redirect:/contact";
	}

}
