package com.tonigdev.portfolio.model.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String bio;
	
	
	@Column(name = "cv_url", length = 100)
	private String cvUrl;
	
	@Column(name = "image_url", length = 100)
	private String imageUrl;
	
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at" , nullable = false)
	private LocalDateTime updatedAt;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "fk_user"), unique = true)
	private User user;

}
