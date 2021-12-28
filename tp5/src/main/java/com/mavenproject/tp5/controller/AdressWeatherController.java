package com.mavenproject.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mavenproject.tp5.model.AddressRepository;

@Controller
public class AdressWeatherController {
	@Autowired
	AddressRepository addressRepository ;
	@GetMapping ("/adresse")
	public String addAddresses(Model model ) {
		return "adresse";
	}
}