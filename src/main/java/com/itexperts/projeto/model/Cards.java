package com.itexperts.projeto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itexperts.projeto.enums.Flag;


@Entity
public class Cards implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 128)
	private String name;

	@Column(nullable = false, length = 45)
	@Enumerated(EnumType.STRING)
	private Flag flag;

	@NotNull
	@OneToMany(mappedBy = "cards", cascade = CascadeType.ALL)
	private List<Type> typeCard;

	@Column(nullable = false, name = "number", length = 20)
	private String number;

	@Column(nullable = false, name = "digit_code", length = 5)
	private String digitCode;

	@Column(nullable = false, name = "limit_balance", length = 20)
	private Double limitBalance;

	@ManyToOne
	@JoinColumn(name = "account_id", referencedColumnName = "id_account")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Account account;

	public Cards() {
	}

	public Cards(Integer id, String name, String number, String digitCode, Double limitBalance) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.digitCode = digitCode;
		this.limitBalance = limitBalance;
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

	public List<Type> getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(List<Type> typeCard) {
		this.typeCard = typeCard;
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

	public Double getLimitBalance() {
		return limitBalance;
	}

	public void setLimitBalance(Double limitBalance) {
		this.limitBalance = limitBalance;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Type> getTypes(List<Type> types) {
		return types;

	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}

}
