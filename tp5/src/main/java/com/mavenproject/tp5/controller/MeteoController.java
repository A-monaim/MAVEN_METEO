package com.mavenproject.tp5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.mavenproject.tp5.model.jsonAddress;
import com.mavenproject.tp5.model.jsonMeteo;


@Controller
public class MeteoController {
	
	private double lat ;
	private double longit ;
	
	@Autowired

	@GetMapping("/meteo")
	public String getmeteo() {
		
		System.out.println(lat+","+longit);

		return "meteo";
	}
	
	@PostMapping ("/meteo")
	public String postmeteo(@RequestParam(name = "adresse") String address , Model model) {
		
		
		
		System.out.println(address);
		
		RestTemplate restTemplate = new RestTemplate();
		
		jsonAddress jsonadress = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+address, jsonAddress.class);
		
		System.out.println(jsonadress.toString());
		
		System.out.println(jsonadress.getFeatures().get(0).getGeometry().getCoordinates());
		model.addAttribute("prop",jsonadress.getFeatures().get(0).getProperties());
		lat = jsonadress.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		longit = jsonadress.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		jsonMeteo jsonmeteo = restTemplate.getForObject("https://api.meteo-concept.com/api/forecast/daily?token=2484141c69e858c08da7a15ae875fe06ebb142ad22a094b1c32f5e572a3302c2&latlng="+lat+","+longit, jsonMeteo.class);
		System.out.println(jsonmeteo.toString());
		for(int i = 0; i < jsonmeteo.getForecast().size() ; i++) {
			String x = "forc"+i;
			model.addAttribute(x,jsonmeteo.getForecast().get(i));
			System.out.println(x+" : "+jsonmeteo.getForecast().get(i).toString());
		}
		
		return "meteo";
	}
}