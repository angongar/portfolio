package com.tonigdev.portfolio.services.technologytype;

import java.util.List;
import java.util.Optional;

import com.tonigdev.portfolio.model.entities.TechnologyType;

public interface TechnologyTypeService {
	
	List<TechnologyType> findAll();
	
	List<TechnologyType> findByUserId(Long iduser);
	
	Optional<TechnologyType> findByName(String name);

}
