package com.mavenproject.tp5.model;

public class City {

	private String insee;
	private int cp;
	private String name;
	private double latitude;
	private double longitude;
	private double altitude;
	
	
	
	public City() {
		super();
	}
	public String getInsee() {
		return insee;
	}
	public void setInsee(String insee) {
		this.insee = insee;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	@Override
	public String toString() {
		return "City [insee=" + insee + ", cp=" + cp + ", name=" + name + ", latitude=" + latitude + ", longitude="
				+ longitude + ", altitude=" + altitude + "]";
	}
	
	
}
