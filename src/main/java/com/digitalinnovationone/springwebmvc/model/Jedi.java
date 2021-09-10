package com.digitalinnovationone.springwebmvc.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Jedi {

	@NotBlank
	@Size (min = 3, max = 20, message = "Name deve conter entre 3 e 20 caracteres")
	private String name;
	
	@NotBlank
	@Size(min = 3, max = 20, message = "LastName deve conter entre 3 e 20 caracteres")
	private String lastName;
	
	public Jedi(final String name, final String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public Jedi() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
