package com.tonigdev.portfolio.services.externallink;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tonigdev.portfolio.model.entities.ExternalLink;
import com.tonigdev.portfolio.repositories.ExternalLinkRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExternalLinkServiceImpl implements ExternalLinkService {

	private final ExternalLinkRepository externalLinkRepository;

	@Override
	public List<ExternalLink> findByUserId(Long iduser) {
		return externalLinkRepository.findByUserId(iduser);
	}
}
