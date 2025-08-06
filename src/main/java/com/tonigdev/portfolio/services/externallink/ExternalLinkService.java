package com.tonigdev.portfolio.services.externallink;

import java.util.List;

import com.tonigdev.portfolio.model.entities.ExternalLink;

public interface ExternalLinkService {
	
	List<ExternalLink> findByUserId(Long iduser);

}
