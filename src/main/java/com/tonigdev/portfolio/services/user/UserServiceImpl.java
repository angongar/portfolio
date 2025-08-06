package com.tonigdev.portfolio.services.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.User;
import com.tonigdev.portfolio.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public Optional<User> findById(Long iduser) {
		return userRepository.findById(iduser);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}



}
