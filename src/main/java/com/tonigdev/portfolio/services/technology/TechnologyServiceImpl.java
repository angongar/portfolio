package com.tonigdev.portfolio.services.technology;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.Technology;
import com.tonigdev.portfolio.repositories.TechnologyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TechnologyServiceImpl implements TechnologyService {

	private final TechnologyRepository technologyRepository;
	
	@Override
	public Optional<Technology> findByName(String name) {
		return technologyRepository.findByName(name);
	}

	@Override
	public List<Technology> findByProjectId(Long idproject) {
		return technologyRepository.findByProjectId(idproject);
	}

}
