package com.imessage.model;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Messaggio")
public class Messaggio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "messaggioID")
	private Integer Id;
	@Column
	private LocalDateTime ms_in;
	@Column
	private String ms_te;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="UtenteRIF")
	private Utente utenterifmss;

	public Messaggio() {
		super();
	}

	public Messaggio(Integer id, LocalDateTime ms_in, String ms_te, Utente utenterifmss) {
		super();
		Id = id;
		this.ms_in = ms_in;
		this.ms_te = ms_te;
		this.utenterifmss = utenterifmss;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public LocalDateTime getMs_in() {
		return ms_in;
	}

	public void setMs_in(LocalDateTime ms_in) {
		this.ms_in = ms_in;
	}

	public String getMs_te() {
		return ms_te;
	}

	public void setMs_te(String ms_te) {
		this.ms_te = ms_te;
	}

	public Utente getUtenterifmss() {
		return utenterifmss;
	}

	public void setUtenterifmss(Utente utenterifmss) {
		this.utenterifmss = utenterifmss;
	}
	

	
}
