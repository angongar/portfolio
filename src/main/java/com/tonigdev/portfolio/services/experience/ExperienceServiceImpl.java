package com.tonigdev.portfolio.services.experience;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.Experience;
import com.tonigdev.portfolio.repositories.ExperienceRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExperienceServiceImpl implements ExperienceService {
	
	private final ExperienceRepository experienceRepository;
	
	@Override
	public List<Experience> findByUserId(Long iduser) {
		return experienceRepository.findByUserId(iduser);
	}

}
