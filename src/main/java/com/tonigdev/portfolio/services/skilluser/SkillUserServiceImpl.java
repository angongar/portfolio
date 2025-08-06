package com.tonigdev.portfolio.services.skilluser;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.SkillUser;
import com.tonigdev.portfolio.repositories.SkillUserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkillUserServiceImpl implements SkillUserService {

	private final SkillUserRepository skillUserRepository;
	
	@Override
	public List<SkillUser> findByUserId(Long iduser) {
		return skillUserRepository.findByUserId(iduser);
	}

}
