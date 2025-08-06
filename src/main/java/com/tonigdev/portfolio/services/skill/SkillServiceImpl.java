package com.tonigdev.portfolio.services.skill;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.Skill;
import com.tonigdev.portfolio.repositories.SkillRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

	private final SkillRepository skillRepository;
	
	@Override
	public Skill save(Skill skill) {
		return skillRepository.save(skill);
	}

	@Override
	public Optional<Skill> findByName(String name) {
		return skillRepository.findByName(name);
	}

}
