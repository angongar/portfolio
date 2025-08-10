package com.tonigdev.portfolio.services.usertechnology;

import java.util.List;

import com.tonigdev.portfolio.model.entities.UserTechnology;

public interface UserTechnologyService {
	
	List<UserTechnology> findByUserId(Long iduser);

}
