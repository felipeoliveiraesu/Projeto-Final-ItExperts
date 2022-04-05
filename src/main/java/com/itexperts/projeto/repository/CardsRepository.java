package com.itexperts.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itexperts.projeto.model.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards, Long> {

}
