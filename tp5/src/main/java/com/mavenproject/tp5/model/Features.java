package com.mavenproject.tp5.model;

public class Features {
	
	private String type;
	private Geometry geometry;
	private Properties properties;
	
	
	
	public Features() {
		super();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Features [type=" + type + ", geometry=" + geometry + ", properties=" + properties + "]";
	}
	
	

}
