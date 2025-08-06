package com.tonigdev.portfolio.services.profile;

import java.util.Optional;

import com.tonigdev.portfolio.model.entities.Profile;

public interface ProfileService {
	
	Profile save(Profile profile);
	
	Optional<Profile> findByUserId(Long iduser);

}
