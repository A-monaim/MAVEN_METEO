package com.mavenproject.tp5.model;

public class Properties {
	
	private String label;
	private double score;
	private String housenumber;
	private String id;
	private String type;
	private String name;
	private String postode;
	private String citycode;
	private double x;
	private double y;
	private String city;
	private String context;
	private double importance;
	private String street;
	
	public Properties() {
		super();
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostode() {
		return postode;
	}
	public void setPostode(String postode) {
		this.postode = postode;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public double getImportance() {
		return importance;
	}
	public void setImportance(double importance) {
		this.importance = importance;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Properties [label=" + label + ", score=" + score + ", housenumber=" + housenumber + ", id=" + id
				+ ", type=" + type + ", name=" + name + ", postode=" + postode + ", citycode=" + citycode + ", x=" + x
				+ ", y=" + y + ", city=" + city + ", context=" + context + ", importance=" + importance + ", street="
				+ street + "]";
	}
	
	
}
