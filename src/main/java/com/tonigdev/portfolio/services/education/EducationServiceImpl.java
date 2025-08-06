package com.tonigdev.portfolio.services.education;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.Education;
import com.tonigdev.portfolio.repositories.EducationRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EducationServiceImpl implements EducationService {
	
	private final EducationRepository educationRepository;
	
	@Override
	public List<Education> findByUserId(Long iduser) {
		return educationRepository.findByUserId(iduser);
	}

}
