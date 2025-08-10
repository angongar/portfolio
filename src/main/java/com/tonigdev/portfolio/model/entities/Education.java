package com.tonigdev.portfolio.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table(name = "education")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String title;
	
	@Column(name = "date_start", nullable = false)
	private LocalDate dateStart;
	
	@Column(name = "date_end")
	private LocalDate dateEnd;

	@Column(nullable = false, length = 100)
	private String location;
	
	@Column(nullable = false, length = 100)
	private String center;
	
	@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at" , nullable = false)
	private LocalDateTime updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_user", nullable = false)
	private User user;
	
	@Transient
	private String formattedText;
	
	/* TODO - Este metodo tendra que ir luego al dto correspondiente*/
	
	public String getFormattedText() {
		StringBuilder res = new StringBuilder();
		
		if(this.dateStart != null) {
			res.append(this.dateStart);
			// TODO - Necesitamos una clase constantes generales
			res.append("-");
		}
		
		if(this.dateEnd != null) {
			res.append(this.dateEnd);
			res.append(": ");
		}
		
		if(this.title != null) {
			res.append(this.title);
			res.append(" ");
		}
		
		if(this.center != null) {
			res.append("(");
			res.append(this.center);
			res.append(")");
		}
		
		return res.toString();
		
	}
}
