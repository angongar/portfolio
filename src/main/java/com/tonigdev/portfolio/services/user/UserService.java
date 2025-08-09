package com.tonigdev.portfolio.services.user;

import java.util.Optional;

import com.tonigdev.portfolio.model.entities.User;

public interface UserService {
	
	User save(User user);
	
	Optional<User> getUser();
	
	Optional<User> findById(Long iduser);
	
	Optional<User> findByEmail(String email);

}
