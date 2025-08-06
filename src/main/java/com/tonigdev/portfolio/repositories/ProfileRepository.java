package com.tonigdev.portfolio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{
	
	/**
	 * Busqueda de perfil por el id de usuario.
	 * @param iduser
	 * @return el perfil del usuario 
	 */
	public Optional<Profile> findByUserId(Long iduser);

}
