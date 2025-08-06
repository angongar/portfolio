package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.SkillUser;

@Repository
public interface SkillUserRepository extends JpaRepository<SkillUser, Long>{

	/**
	 * Busqueda de skills del usuario
	 * @param iduser
	 * @return skills del usuario
	 */
	
	public List<SkillUser> findByUserId(Long iduser);
}
