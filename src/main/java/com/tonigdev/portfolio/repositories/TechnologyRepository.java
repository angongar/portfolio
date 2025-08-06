package com.tonigdev.portfolio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long>{
	
	/**
	 * Busqueda de tecnologias por nombre
	 * @param name
	 * @return devuelve la tecnologia
	 */
	
	public Optional<Technology> findByName(String name);
	
	
	/**
	 * Busqueda de las tecnologias de un proyecto
	 * @param iduser
	 * @return devuelve listado de proyectos de un usuario
	 */
	
	public List<Technology> findByProjectId(Long idproject);

}
