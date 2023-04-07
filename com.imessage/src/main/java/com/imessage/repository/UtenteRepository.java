package com.imessage.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imessage.model.Utente;



@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

	public Utente findByEmaiAndPass (String emai, String pass);
	
	public Utente findByEmai (String email);
}
