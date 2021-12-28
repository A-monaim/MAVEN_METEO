package com.mavenproject.tp5.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class jsonMeteo {

	private City city;
	private String update;
	private List<Forecast> forecast;
	
	public jsonMeteo() {
		super();
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public List<Forecast> getForecast() {
		return forecast;
	}

	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}

	@Override
	public String toString() {
		return "jsonMeteo [city=" + city.toString() + ", update=" + update + ", forecast=" + forecast.toString() + "]";
	}
	
	
}
