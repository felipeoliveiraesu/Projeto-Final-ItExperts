package com.itexperts.projeto.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.itexperts.projeto.model.Account;
import com.itexperts.projeto.model.Cards;
import com.itexperts.projeto.model.Type;
import com.itexperts.projeto.repository.AccountRepository;
import com.itexperts.projeto.repository.CardsRepository;
import com.itexperts.projeto.repository.TypeRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private CardsRepository cardRepository;

	@Autowired
	private TypeRepository typeRepository;

	
	private List<Type> cardsTypeAccount = new ArrayList<>();

	@Transactional
	public Account create(Account account) {
		account = accountRepository.save(account);
		cardRepository.saveAll(account.getCards());

		for (Cards cards : account.getCards()) {
			setCardsTypeAccount(cards.getTypeCard());
		}
		typeRepository.saveAll(getCardsTypeAccount());

		return account;
	}

	public Account getById(Long id) {
		Optional<Account> accountReturned = accountRepository.findById(id);
		accountReturned.orElseThrow(() -> new RuntimeException("Account not found"));
		return accountReturned.get();
	}

	public List<Account> getAll() {
		return accountRepository.findAll();
	}

	public Account update(Account account, Long id) {

		Optional<Account> accountReturned = accountRepository.findById(id);

		accountReturned.orElseThrow(() -> new RuntimeException("Account not found"));

		accountReturned.get().setNameOwner(account.getNameOwner());
		accountReturned.get().setAgencyCode(account.getAgencyCode());
		accountReturned.get().setAccountCode(account.getAccountCode());
		accountReturned.get().setVerificationDigital(account.getVerificationDigital());

		return accountRepository.save(accountReturned.get());
	}

	public void delete(Long id) {
		try {
			accountRepository.deleteById(id);
		} catch (Exception e) {

		}
	}

	public void setCardsTypeAccount(List<Type> list) {
		this.cardsTypeAccount = list;
	}

	public List<Type> getCardsTypeAccount() {
		return cardsTypeAccount;
	}
}
