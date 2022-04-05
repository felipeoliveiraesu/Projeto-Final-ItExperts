package com.itexperts.projeto.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itexperts.projeto.model.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {

	Optional<Type> findByName(String typeCardName);

}
