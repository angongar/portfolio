package com.tonigdev.portfolio.services.projecttype;

import java.util.List;
import java.util.Optional;

import com.tonigdev.portfolio.model.entities.ProjectType;

public interface ProjectTypeService {
	
	List<ProjectType> findByUserId(Long iduser);
	
	Optional<ProjectType> findByName(String name);

}
