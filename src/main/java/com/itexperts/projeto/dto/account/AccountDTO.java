package com.itexperts.projeto.dto.account;

import java.util.Objects;

public class AccountDTO {

	private Integer id;
	private String nameOwner;
	private String agencyCode;
	private String accountCode;
	private String verificationDigit;
	private String registerId;

	public AccountDTO(Integer id, String nameOwner, String agencyCode, String accountCode, String verificationDigit,
			String registerId) {
		this.id = id;
		this.nameOwner = nameOwner;
		this.agencyCode = agencyCode;
		this.accountCode = accountCode;
		this.verificationDigit = verificationDigit;
		this.registerId = registerId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	@Override
	public int hashCode() {
		return Objects.hash(accountCode, agencyCode, id, nameOwner, registerId, verificationDigit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountDTO other = (AccountDTO) obj;
		return Objects.equals(accountCode, other.accountCode) && Objects.equals(agencyCode, other.agencyCode)
				&& Objects.equals(id, other.id) && Objects.equals(nameOwner, other.nameOwner)
				&& Objects.equals(registerId, other.registerId)
				&& Objects.equals(verificationDigit, other.verificationDigit);
	}

	@Override
	public String toString() {
		return "AccountDTO [id=" + id + ", nameOwner=" + nameOwner + ", agencyCode=" + agencyCode + ", accountCode="
				+ accountCode + ", verificationDigit=" + verificationDigit + ", registerId=" + registerId + "]";
	}

}
