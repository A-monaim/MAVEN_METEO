package com.mavenproject.tp5.model;

public class Forecast {
	
	private String insee;
	private double cp;
	private double latitude;
	private double longitude;
	private double day;
	private String datetime;
	private double wind10m;
	private double gust10m;
	private double rr10;
	private double rr1;
	private double probarain;
	private double weather;
	private double tmin;
	private double tmax;
	private double sun_hours;
	private double etp;
	private double probafrost;
	private double probafog;
	private double probawind70;
	private double probawind100;
	private double gustx;
	
	public Forecast() {
		super();
	}

	public String getInsee() {
		return insee;
	}

	public void setInsee(String insee) {
		this.insee = insee;
	}

	public double getCp() {
		return cp;
	}

	public void setCp(double cp) {
		this.cp = cp;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getDay() {
		return day;
	}

	public void setDay(double day) {
		this.day = day;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public double getWind10m() {
		return wind10m;
	}

	public void setWind10m(double wind10m) {
		this.wind10m = wind10m;
	}

	public double getGust10m() {
		return gust10m;
	}

	public void setGust10m(double gust10m) {
		this.gust10m = gust10m;
	}

	public double getRr10() {
		return rr10;
	}

	public void setRr10(double rr10) {
		this.rr10 = rr10;
	}

	public double getRr1() {
		return rr1;
	}

	public void setRr1(double rr1) {
		this.rr1 = rr1;
	}

	public double getProbarain() {
		return probarain;
	}

	public void setProbarain(double probarain) {
		this.probarain = probarain;
	}

	public double getWeather() {
		return weather;
	}

	public void setWeather(double weather) {
		this.weather = weather;
	}

	public double getTmin() {
		return tmin;
	}

	public void setTmin(double tmin) {
		this.tmin = tmin;
	}

	public double getTmax() {
		return tmax;
	}

	public void setTmax(double tmax) {
		this.tmax = tmax;
	}

	public double getSun_hours() {
		return sun_hours;
	}

	public void setSun_hours(double sun_hours) {
		this.sun_hours = sun_hours;
	}

	public double getEtp() {
		return etp;
	}

	public void setEtp(double etp) {
		this.etp = etp;
	}

	public double getProbafrost() {
		return probafrost;
	}

	public void setProbafrost(double probafrost) {
		this.probafrost = probafrost;
	}

	public double getProbafog() {
		return probafog;
	}

	public void setProbafog(double probafog) {
		this.probafog = probafog;
	}

	public double getProbawind70() {
		return probawind70;
	}

	public void setProbawind70(double probawind70) {
		this.probawind70 = probawind70;
	}

	public double getProbawind100() {
		return probawind100;
	}

	public void setProbawind100(double probawind100) {
		this.probawind100 = probawind100;
	}

	public double getGustx() {
		return gustx;
	}

	public void setGustx(double gustx) {
		this.gustx = gustx;
	}

	@Override
	public String toString() {
		return "Forecast [insee=" + insee + ", cp=" + cp + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", day=" + day + ", datetime=" + datetime + ", wind10m=" + wind10m + ", gust10m=" + gust10m
				+ ", rr10=" + rr10 + ", rr1=" + rr1 + ", probarain=" + probarain + ", weather=" + weather + ", tmin="
				+ tmin + ", tmax=" + tmax + ", sun_hours=" + sun_hours + ", etp=" + etp + ", probafrost=" + probafrost
				+ ", probafog=" + probafog + ", probawind70=" + probawind70 + ", probawind100=" + probawind100
				+ ", gustx=" + gustx + "]";
	}
	
	

}
