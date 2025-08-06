package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
	
	/**
	 * Busqueda por los estudios del usuario
	 * @param iduser
	 * @return devuelve el listado de estudios del usuario
	 */
	public List<Education> findByUserId(Long iduser);

}
