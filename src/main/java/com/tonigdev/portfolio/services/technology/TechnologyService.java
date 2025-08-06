package com.tonigdev.portfolio.services.technology;

import java.util.List;
import java.util.Optional;

import com.tonigdev.portfolio.model.entities.Technology;

public interface TechnologyService {
	
	Optional<Technology> findByName(String name);
	
	List<Technology> findByProjectId(Long idproject);

}
