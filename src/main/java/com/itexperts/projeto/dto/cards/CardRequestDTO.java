package com.itexperts.projeto.dto.cards;

import java.math.BigDecimal;
import java.util.Objects;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.itexperts.projeto.enums.Flag;

public class CardRequestDTO {

	@NotBlank
	@Max(128)
	private String name;
	@Max(45)
	private Flag flag;
	@NotBlank
	@Max(45)
	private String type;
	@NotBlank
	@Min(20)
	@Max(20)
	private String number;
	@NotBlank
	@Max(5)
	private String digitCode;
	@NotBlank
	@Digits(integer = 18, fraction = 2)
	private BigDecimal limitBalance;

	public CardRequestDTO(@NotBlank @Max(128) String name, @Max(45) Flag flag, @NotBlank @Max(45) String type,
			@NotBlank @Min(20) @Max(20) String number, @NotBlank @Max(5) String digitCode,
			@NotBlank @Digits(integer = 18, fraction = 2) BigDecimal limitBalance) {
		this.name = name;
		this.flag = flag;
		this.type = type;
		this.number = number;
		this.digitCode = digitCode;
		this.limitBalance = limitBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDigitCode() {
		return digitCode;
	}

	public void setDigitCode(String digitCode) {
		this.digitCode = digitCode;
	}

	public BigDecimal getLimitBalance() {
		return limitBalance;
	}

	public void setLimitBalance(BigDecimal limitBalance) {
		this.limitBalance = limitBalance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(digitCode, flag, limitBalance, name, number, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardRequestDTO other = (CardRequestDTO) obj;
		return Objects.equals(digitCode, other.digitCode) && flag == other.flag
				&& Objects.equals(limitBalance, other.limitBalance) && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "CardRequestDTO [name=" + name + ", flag=" + flag + ", type=" + type + ", number=" + number
				+ ", digitCode=" + digitCode + ", limitBalance=" + limitBalance + "]";
	}

}
