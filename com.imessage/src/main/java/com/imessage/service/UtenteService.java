package com.imessage.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imessage.dto.UtenteDto;
import com.imessage.model.Utente;
import com.imessage.repository.UtenteRepository;

@Service
public class UtenteService {

	@Autowired
	private UtenteRepository repo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	public UtenteDto upsert (UtenteDto utenteDto) {
		try {
			Utente utente = repo.save(mapper.map(utenteDto,Utente.class));
		
			if (utente.getId() !=null)
				return mapper.map(utente, UtenteDto.class);
		} catch (Exception e) {
	}
		return null;
}
	public UtenteDto findByEmaiAndPass (UtenteDto user ) {
		Utente utente = repo.findByEmaiAndPass(user.getEmai(),user.getPass());
		if(utente == null)
			return null;
		return mapper.map(utente, UtenteDto.class);
	}
}
