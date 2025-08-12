package com.tonigdev.portfolio.services.projecttype;

import java.util.List;
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
	public List<ProjectType> findByUserId(Long iduser) {
		return projectTypeRepository.findByUserId(iduser);
	}

	@Override
	public Optional<ProjectType> findByName(String name) {
		return projectTypeRepository.findByName(name);
	}

}
