package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	/**
	 * Busqueda de proyectos del usuario
	 * @param iduser
	 * @return devuelve listado de proyectos de un usuario
	 */
	
	public List<Project> findByUserId(Long iduser);
	
	/**
	 * Busqueda de proyectos que tenga una tecnologia
	 * @param iduser
	 * @return devuelve listado de proyectos de un usuario
	 */
	@Query("SELECT p FROM Project p JOIN p.technologies t WHERE t.id = :idtechnology")
	public List<Project> findByTechnologyId(@Param("idtechnology") Long idtechnology);

}
