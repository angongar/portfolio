package com.tonigdev.portfolio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{
	
	/**
	 * Busqueda de skill por nombre
	 * @param name
	 * @return skill
	 */
	public Optional<Skill> findByName(String name);

}
