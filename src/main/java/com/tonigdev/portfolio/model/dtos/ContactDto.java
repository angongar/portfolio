package com.tonigdev.portfolio.model.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ContactDto {
	
	@NotBlank(message = "El campo 'nombre' es obligatorio")
	@Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
	private String name;
	
	@NotBlank(message = "El campo 'email' es obligatorio")
	@Email(message = "El email introducido no es válido")
	private String email;

	@NotBlank(message = "El campo 'asunto' es obligatorio")
	@Size(max = 100, message = "El asunto no puede tener más de 50 caracteres")
	private String subject;
	
    @NotBlank(message = "El 'mensaje' es obligatorio")
    @Size(max = 1000, message = "El mensaje no puede superar los 1000 caracteres")
	private String message;

}
