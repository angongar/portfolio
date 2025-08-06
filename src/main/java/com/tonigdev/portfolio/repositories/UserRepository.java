package com.tonigdev.portfolio.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tonigdev.portfolio.model.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	/**
	 * Busqueda de usuario por email.
	 * @param email email del usuario
	 * @return el usuario como un objeto Optional
	 */
	public Optional<User> findByEmail(String email);

}
