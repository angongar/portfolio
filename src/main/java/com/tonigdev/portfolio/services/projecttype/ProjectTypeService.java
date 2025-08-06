package com.tonigdev.portfolio.services.projecttype;

import java.util.Optional;

import com.tonigdev.portfolio.model.entities.ProjectType;

public interface ProjectTypeService {
	
	Optional<ProjectType> findByName(String name);

}
