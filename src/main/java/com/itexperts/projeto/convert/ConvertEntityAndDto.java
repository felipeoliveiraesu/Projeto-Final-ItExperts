package com.itexperts.projeto.convert;

import com.itexperts.projeto.dto.account.AccountRequestDTO;
import com.itexperts.projeto.dto.account.AccountResponseDTO;
import com.itexperts.projeto.model.Account;

public class ConvertEntityAndDto {
	
	public static AccountResponseDTO convertEntityToDTO(Account accountEntity) {

		AccountResponseDTO accountDTO = new AccountResponseDTO();
		accountDTO.setId(accountEntity.getId());
		accountDTO.setNameOwner(accountEntity.getNameOwner());
		accountDTO.setAgencyCode(accountEntity.getAgencyCode());
		accountDTO.setAccountCode(accountEntity.getAccountCode());
		accountDTO.setVerificationDigit(accountEntity.getVerificationDigital());
		accountDTO.setRegisterId(accountEntity.getRegisterId());
		accountDTO.setCards(accountEntity.getCards());

		return accountDTO;
	}

	public Account convertDtoToEntity(AccountRequestDTO accountDTO) {

		Account accountEntity = new Account();
		accountEntity.setNameOwner(accountDTO.getNameOwner());
		accountEntity.setAgencyCode(accountDTO.getAgencyCode());
		accountEntity.setAccountCode(accountDTO.getAccountCode());
		accountEntity.setVerificationDigital(accountDTO.getVerificationDigit());;
		accountEntity.setRegisterId(accountDTO.getRegisterId());
		accountEntity.setCards(accountDTO.getCards());

		return accountEntity;
	}
}
