package com.tonigdev.portfolio.services.usertechnology;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.UserTechnology;
import com.tonigdev.portfolio.repositories.UserTechnologyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserTechnologyServiceImpl implements UserTechnologyService {

	private final UserTechnologyRepository userTechnologyRepository;
	
	@Override
	public List<UserTechnology> findByUserId(Long iduser) {
		return userTechnologyRepository.findByUserId(iduser);
	}

}
