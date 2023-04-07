package com.imessage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.imessage.dto.UtenteDto;
import com.imessage.service.UtenteService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller
@RequestMapping("Imessage")
@CrossOrigin("*") //dico a tomcat che altre applicazioni possono accedere al web
public class UtenteController {

	@Autowired
	private UtenteService service;
	
	@GetMapping 
	public String redirectToLoginPage() {
		return "redirect:Imessage/";	
	}
	@GetMapping("/")
	public String loginPage(HttpServletRequest request,Model model) {
		if(this.checkSession(request) !=null) {
			return "redirect:/Imessage/utente/chat";
		}
		this.buildModel(model);
		return "Imessage";
	}
	@GetMapping("signUp")
	public String signUp(Model model) {
		this.buildModel(model);
		return "utenteForm";
	}
	@PostMapping("login/checkCredentials")
	public String checkCredentials(@ModelAttribute UtenteDto objDto, HttpServletRequest request) {
		UtenteDto utente = service.findByEmaiAndPass(objDto);
		
		if (utente != null){
			HttpSession session = request.getSession();
			session.setAttribute("Imessageutente", utente);
			session.setMaxInactiveInterval(600);
		}
	 	
		return "redirect:/Imessage";
	}
	@PostMapping("save/utente")
	public String saveUtente(@ModelAttribute UtenteDto objDto, HttpServletRequest request) {

		UtenteDto utente = service.upsert(objDto);


		if (utente != null) {
			return "redirect:/Imessage/";
		}

		return "redirect:/Imessage/signUp";
	}
	

	
	private UtenteDto checkSession(HttpServletRequest request) {
		HttpSession sessione = request.getSession();
		return (UtenteDto) sessione.getAttribute("ImessageUtente");
	}
	
	private void buildModel(Model model) {
		UtenteDto user = new UtenteDto();
		model.addAttribute("utente", user);
	}
}
