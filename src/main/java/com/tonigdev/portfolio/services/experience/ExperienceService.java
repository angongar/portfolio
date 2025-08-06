package com.tonigdev.portfolio.services.experience;

import java.util.List;

import com.tonigdev.portfolio.model.entities.Experience;

public interface ExperienceService {
	
	List<Experience> findByUserId(Long iduser);

}
