package com.itexperts.projeto.dto.cards;

import java.math.BigDecimal;
import java.util.Objects;

import com.itexperts.projeto.enums.Flag;
import com.itexperts.projeto.model.Type;

public class CardResponseDTO {

	private Integer id;
	private String name;
	private Flag flag;
	private Type type;
	private String number;
	private String digitCode;
	private BigDecimal limitBalance;
	private Integer accountId;

	public CardResponseDTO(Integer id, String name, Flag flag, Type type, String number, String digitCode,
			BigDecimal limitBalance, Integer accountId) {
		this.id = id;
		this.name = name;
		this.flag = flag;
		this.type = type;
		this.number = number;
		this.digitCode = digitCode;
		this.limitBalance = limitBalance;
		this.accountId = accountId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
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

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, digitCode, flag, id, limitBalance, name, number, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardResponseDTO other = (CardResponseDTO) obj;
		return Objects.equals(accountId, other.accountId) && Objects.equals(digitCode, other.digitCode)
				&& flag == other.flag && Objects.equals(id, other.id)
				&& Objects.equals(limitBalance, other.limitBalance) && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "CardResponseDTO [id=" + id + ", name=" + name + ", flag=" + flag + ", type=" + type + ", number="
				+ number + ", digitCode=" + digitCode + ", limitBalance=" + limitBalance + ", accountId=" + accountId
				+ "]";
	}

}
