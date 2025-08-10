package com.tonigdev.portfolio.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.TechnologyType;

@Repository
public interface TechnologyTypeRepository extends JpaRepository<TechnologyType, Long>{
	
	@Query("SELECT DISTINCT tt FROM TechnologyType tt "
			+ "JOIN Technology t ON t.technologyType = tt "
			+ "JOIN UserTechnology ut ON ut.technology = t WHERE ut.user.id = :iduser")
	public List<TechnologyType> findByUserId(@Param("iduser") Long iduser);
	
	/**
	 * Busqueda de categorias por nombre
	 * @param name
	 * @return la categoria como un objeto Optional
	 */
	public Optional<TechnologyType> findByName(String name);

}
