package com.imessage.model;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "utenteID")
	private Integer Id;
	@Column
	private String us_na;
	@Column
	private String emai;
	@Column
	private String pass;
	@Column
	private boolean is_admin;
	
	@OneToMany(mappedBy = "utenterifmss", fetch = FetchType.LAZY)
	private List<Messaggio> listmessaggi;

	public Utente() {
		super();
	}

	public Utente(Integer id, String us_na, String emai, String pass, boolean is_admin, List<Messaggio> listmessaggi) {
		super();
		Id = id;
		this.us_na = us_na;
		this.emai = emai;
		this.pass = pass;
		this.is_admin = is_admin;
		this.listmessaggi = listmessaggi;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUs_na() {
		return us_na;
	}

	public void setUs_na(String us_na) {
		this.us_na = us_na;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isIs_admin() {
		return is_admin;
	}

	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}

	public List<Messaggio> getListmessaggi() {
		return listmessaggi;
	}

	public void setListmessaggi(List<Messaggio> listmessaggi) {
		this.listmessaggi = listmessaggi;
	}
	
	
	

}
