package com.itexperts.projeto.dto.account;

import java.util.List;
import java.util.Objects;

import com.itexperts.projeto.model.Cards;

public class AccountResponseDTO {

	private Long id;
	private String nameOwner;
	private String agencyCode;
	private String accountCode;
	private String verificationDigit;
	private String registerId;
	private List<Cards> cards;
	
	

	public AccountResponseDTO() {
	}

	public AccountResponseDTO(Long id, String nameOwner, String agencyCode, String accountCode,
			String verificationDigit, String registerId, List<Cards> cards) {
		this.id = id;
		this.nameOwner = nameOwner;
		this.agencyCode = agencyCode;
		this.accountCode = accountCode;
		this.verificationDigit = verificationDigit;
		this.registerId = registerId;
		this.cards = cards;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long long1) {
		this.id = long1;
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
		return Objects.hash(accountCode, agencyCode, cards, id, nameOwner, registerId, verificationDigit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountResponseDTO other = (AccountResponseDTO) obj;
		return Objects.equals(accountCode, other.accountCode) && Objects.equals(agencyCode, other.agencyCode)
				&& Objects.equals(cards, other.cards) && Objects.equals(id, other.id)
				&& Objects.equals(nameOwner, other.nameOwner) && Objects.equals(registerId, other.registerId)
				&& Objects.equals(verificationDigit, other.verificationDigit);
	}

	@Override
	public String toString() {
		return "AccountResponseDTO [id=" + id + ", nameOwner=" + nameOwner + ", agencyCode=" + agencyCode
				+ ", accountCode=" + accountCode + ", verificationDigit=" + verificationDigit + ", registerId="
				+ registerId + ", cards=" + cards + "]";
	}

}
