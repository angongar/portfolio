package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{
	
	/**
	 * Busqueda por los estudios del usuario
	 * @param iduser
	 * @return devuelve el listado de estudios del usuario
	 */
	@Query("SELECT e FROM Education e JOIN e.user u WHERE u.id = :iduser ORDER BY e.dateEnd DESC")
	public List<Education> findByUserId(@Param("iduser") Long iduser);

}
