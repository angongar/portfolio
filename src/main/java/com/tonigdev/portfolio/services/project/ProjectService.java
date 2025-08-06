package com.tonigdev.portfolio.services.project;

import java.util.List;

import com.tonigdev.portfolio.model.entities.Project;

public interface ProjectService {
	
	List<Project> findByUserId(Long iduser);
	
	List<Project> findByTechnologyId(Long idtechnology);

}
