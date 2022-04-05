package com.itexperts.projeto.dto.account;

import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

import com.itexperts.projeto.model.Cards;

public class AccountRequestDTO {

	@NotBlank
	@Max(50)
	private String nameOwner;
	@NotBlank
	@Max(4)
	private String agencyCode;
	@NotBlank
	@Max(8)
	private String accountCode;
	@NotBlank
	@Max(1)
	private String verificationDigit;
	@NotBlank
	@Max(20)
	private String registerId;
	@NotBlank
	private List<Cards> cards;

	public AccountRequestDTO(@NotBlank @Max(50) String nameOwner, @NotBlank @Max(4) String agencyCode,
			@NotBlank @Max(8) String accountCode, @NotBlank @Max(1) String verificationDigit,
			@NotBlank @Max(20) String registerId, @NotBlank List<Cards> cards) {
		this.nameOwner = nameOwner;
		this.agencyCode = agencyCode;
		this.accountCode = accountCode;
		this.verificationDigit = verificationDigit;
		this.registerId = registerId;
		this.cards = cards;
	}

	public String getNameOwner() {
		return nameOwner;
	}

	public void setNameOwner(String nameOwner) {
		this.nameOwner = nameOwner;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getVerificationDigit() {
		return verificationDigit;
	}

	public void setVerificationDigit(String verificationDigit) {
		this.verificationDigit = verificationDigit;
	}

	public String getRegisterId() {
		return registerId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	public List<Cards> getCards() {
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountCode, agencyCode, cards, nameOwner, registerId, verificationDigit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountRequestDTO other = (AccountRequestDTO) obj;
		return Objects.equals(accountCode, other.accountCode) && Objects.equals(agencyCode, other.agencyCode)
				&& Objects.equals(cards, other.cards) && Objects.equals(nameOwner, other.nameOwner)
				&& Objects.equals(registerId, other.registerId)
				&& Objects.equals(verificationDigit, other.verificationDigit);
	}

	@Override
	public String toString() {
		return "AccountRequestDTO [nameOwner=" + nameOwner + ", agencyCode=" + agencyCode + ", accountCode="
				+ accountCode + ", verificationDigit=" + verificationDigit + ", registerId=" + registerId + ", cards="
				+ cards + "]";
	}
}
