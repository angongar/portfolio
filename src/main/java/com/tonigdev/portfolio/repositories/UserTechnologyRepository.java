package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.UserTechnology;

@Repository
public interface UserTechnologyRepository extends JpaRepository<UserTechnology, Long>{

	/**
	 * Busqueda de tecnologias del usuario
	 * @param iduser
	 * @return skills del usuario
	 */
	
	public List<UserTechnology> findByUserId(Long iduser);
}
