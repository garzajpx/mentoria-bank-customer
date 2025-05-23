package com.mentoria.indra.bank.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	
	@NotNull
	private Integer custId;
	
	@NotNull
	private Integer dotyId;
	
	@NotNull
	@Size(min = 3, max = 100)
	private String address;

	@NotNull
	@Email(message = "El correo electronico no esta bien escrito")
	private String email;

	@NotNull
	@Size(min = 1,max = 1)
	private String enable;

	@NotNull
	@Size(min = 1,max = 100)
	private String name;

	@NotNull
	@Size(min = 1,max = 100)
	private String phone;
	
	@NotNull
	@Size(min = 1,max = 100)
	private String token;

}