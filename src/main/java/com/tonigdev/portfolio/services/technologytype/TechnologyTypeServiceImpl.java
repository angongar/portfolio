package com.tonigdev.portfolio.services.technologytype;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.TechnologyType;
import com.tonigdev.portfolio.repositories.TechnologyTypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TechnologyTypeServiceImpl implements TechnologyTypeService {
	
	private final TechnologyTypeRepository technologyTypeRepository;
	
	@Override
	public List<TechnologyType> findAll() {
		return technologyTypeRepository.findAll();
	}
	
	@Override
	public List<TechnologyType> findByUserId(Long iduser) {
		return technologyTypeRepository.findByUserId(iduser);
	}

	@Override
	public Optional<TechnologyType> findByName(String name) {
		return technologyTypeRepository.findByName(name);
	}


}
