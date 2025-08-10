package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long>{
	
	/**
	 * Busqueda por experiencia laboral del usuario
	 * @param iduser
	 * @return devuelve el listado de experiencias laborales del usuario
	 */
	@Query("SELECT e FROM Experience e JOIN e.user u WHERE u.id = :iduser ORDER BY e.dateEnd DESC")
	public List<Experience> findByUserId(@Param("iduser") Long iduser);

}
