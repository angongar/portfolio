package com.tonigdev.portfolio.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "technology")
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(name = "icon_url",length = 100)
	private String iconUrl;
	
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	

	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;
}
