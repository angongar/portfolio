package com.tonigdev.portfolio.services.skilluser;

import java.util.List;

import com.tonigdev.portfolio.model.entities.SkillUser;

public interface SkillUserService {
	
	List<SkillUser> findByUserId(Long iduser);

}
