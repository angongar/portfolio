package com.tonigdev.portfolio.services.profile;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.Profile;
import com.tonigdev.portfolio.repositories.ProfileRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

	private final ProfileRepository profileRepository;
	
	@Override
	public Profile save(Profile profile) {
		return profileRepository.save(profile);
	}

	@Override
	public Optional<Profile> findByUserId(Long iduser) {
		return profileRepository.findByUserId(iduser);
	}

}
