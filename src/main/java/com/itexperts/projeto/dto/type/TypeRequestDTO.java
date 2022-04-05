package com.itexperts.projeto.dto.type;

import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

public class TypeRequestDTO {

	@NotBlank
	@Max(45)
	private String name;

	public TypeRequestDTO(@NotBlank @Max(45) String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TypeRequestDTO other = (TypeRequestDTO) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "TypeRequestDTO [name=" + name + "]";
	}
}
