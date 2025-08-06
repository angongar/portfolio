package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{
	
	/**
	 * Busqueda por experiencia laboral del usuario
	 * @param iduser
	 * @return devuelve el listado de experiencias laborales del usuario
	 */
	public List<Experience> findByUserId(Long iduser);

}
