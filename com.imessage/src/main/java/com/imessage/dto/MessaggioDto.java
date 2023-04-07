package com.imessage.dto;

import java.time.LocalDate;


public class MessaggioDto {

	private LocalDate ms_in;
	private String ms_te;
	public MessaggioDto() {
		super();
	}
	public MessaggioDto(LocalDate ms_in, String ms_te) {
		super();
		this.ms_in = ms_in;
		this.ms_te = ms_te;
	}
	public LocalDate getMs_in() {
		return ms_in;
	}
	public void setMs_in(LocalDate ms_in) {
		this.ms_in = ms_in;
	}
	public String getMs_te() {
		return ms_te;
	}
	public void setMs_te(String ms_te) {
		this.ms_te = ms_te;
	}
	
	
}
