package com.tonigdev.portfolio.services.education;

import java.util.List;

import com.tonigdev.portfolio.model.entities.Education;

public interface EducationService {
	
	List<Education> findByUserId(Long iduser);

}
