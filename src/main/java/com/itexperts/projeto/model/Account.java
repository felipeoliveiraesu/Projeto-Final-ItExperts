package com.itexperts.projeto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_account")
	private Long id;

	@Column(nullable = false, name = "name_owner", length = 50)
	private String nameOwner;

	@Column(nullable = false, name = "agency_code", length = 4)
	private String agencyCode;

	@Column(nullable = false, name = "account_code", length = 8)
	private String accountCode;

	@Column(nullable = false, name = "verification_digital", length = 1)
	private String verificationDigital;

//	@JsonManagedReference
	@OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
	private List<Cards> cards = new ArrayList<>();

	@Column(nullable = false, name = "register_id", length = 20, unique = true)
	private String registerId;

	public Account() {
	}

	public Account(Long id, String nameOwner, String agencyCode, String accountCode, String verificationDigital,
			String registerId) {
		this.id = id;
		this.nameOwner = nameOwner;
		this.agencyCode = agencyCode;
		this.accountCode = accountCode;
		this.verificationDigital = verificationDigital;
		this.registerId = registerId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getVerificationDigital() {
		return verificationDigital;
	}

	public void setVerificationDigital(String verificationDigital) {
		this.verificationDigital = verificationDigital;
	}

	public List<Cards> getCards() {
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}

	public String getRegisterId() {
		return registerId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountCode, agencyCode, cards, id, nameOwner, verificationDigital);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountCode, other.accountCode) && Objects.equals(agencyCode, other.agencyCode)
				&& Objects.equals(cards, other.cards) && Objects.equals(id, other.id)
				&& Objects.equals(nameOwner, other.nameOwner)
				&& Objects.equals(verificationDigital, other.verificationDigital);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", nameOwner=" + nameOwner + ", agencyCode=" + agencyCode + ", accountCode="
				+ accountCode + ", verificationDigital=" + verificationDigital + ", cards=" + cards + "]";
	}

}
