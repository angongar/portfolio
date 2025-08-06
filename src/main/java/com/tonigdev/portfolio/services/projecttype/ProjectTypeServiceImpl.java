package com.tonigdev.portfolio.services.projecttype;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.ProjectType;
import com.tonigdev.portfolio.repositories.ProjectTypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProjectTypeServiceImpl implements ProjectTypeService {
	
	private final ProjectTypeRepository projectTypeRepository;

	@Override
	public Optional<ProjectType> findByName(String name) {
		return projectTypeRepository.findByName(name);
	}

}
