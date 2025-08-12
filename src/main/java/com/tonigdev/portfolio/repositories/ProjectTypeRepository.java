package com.tonigdev.portfolio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.ProjectType;
import com.tonigdev.portfolio.model.entities.TechnologyType;

@Repository
public interface ProjectTypeRepository extends JpaRepository<ProjectType, Long>{
	
	@Query("SELECT DISTINCT pt FROM ProjectType pt "
			+ "JOIN Project p ON p.projectType = pt WHERE p.user.id = :iduser")
	public List<ProjectType> findByUserId(@Param("iduser") Long iduser);
	
	/**
	 * Busqueda de categorias por nombre
	 * @param name
	 * @return la categoria como un objeto Optional
	 */
	public Optional<ProjectType> findByName(String name);

}
