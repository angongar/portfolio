package com.tonigdev.portfolio.services.project;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.Project;
import com.tonigdev.portfolio.repositories.ProjectRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

	private final ProjectRepository projectRepository;
	
	@Override
	public List<Project> findByUserId(Long iduser) {
		return projectRepository.findByUserId(iduser);
	}

	@Override
	public List<Project> findByTechnologyId(Long idtechnology) {
		return projectRepository.findByTechnologyId(idtechnology);
	}

}
