package com.tonigdev.portfolio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.ExternalLink;

@Repository
public interface ExternalLinkRepository extends JpaRepository<ExternalLink, Long>{
	
	
	/**
	 * Busqueda de los links externos de un usuario
	 * @param iduser
	 * @return listado de links externos de un usuario.
	 */
	public List<ExternalLink> findByUserId(Long iduser);

}
