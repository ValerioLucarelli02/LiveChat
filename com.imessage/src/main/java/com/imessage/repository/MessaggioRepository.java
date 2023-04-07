package com.imessage.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imessage.model.Messaggio;

public interface MessaggioRepository extends JpaRepository<Messaggio, Integer> {

	Optional<Messaggio> findById (Integer Id);
}
