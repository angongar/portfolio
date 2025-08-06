package com.tonigdev.portfolio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.ProjectType;

@Repository
public interface ProjectTypeRepository extends JpaRepository<ProjectType, Long>{
	
	
	/**
	 * Busqueda de categorias por nombre
	 * @param name
	 * @return la categoria como un objeto Optional
	 */
	public Optional<ProjectType> findByName(String name);

}
