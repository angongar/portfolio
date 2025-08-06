package com.tonigdev.portfolio.services.skill;

import java.util.Optional;

import com.tonigdev.portfolio.model.entities.Skill;

public interface SkillService {
	
	Skill save(Skill skill);
	
	Optional<Skill> findByName(String name);

}
