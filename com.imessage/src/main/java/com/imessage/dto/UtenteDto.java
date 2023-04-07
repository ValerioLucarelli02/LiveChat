package com.imessage.dto;


public class UtenteDto {

	private String us_na;
	
	private String emai;
	
	private String pass;
	
	private boolean is_admin;

	public UtenteDto() {
		super();
	}

	public UtenteDto(String us_na, String emai, String pass, boolean is_admin) {
		super();
		this.us_na = us_na;
		this.emai = emai;
		this.pass = pass;
		this.is_admin = is_admin;
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
	
	
}
