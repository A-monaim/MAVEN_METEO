package com.mavenproject.tp5.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class jsonAddress {
	
	private String type;
	private String version;
	private List<Features> features;
	private String attribution;
	private String licence;
	private String query;
	private String limit;
	
	
	
	public jsonAddress() {
		super();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public List<Features> getFeatures() {
		return features;
	}
	public void setFeatures(List<Features> features) {
		this.features = features;
	}
	public String getAttribution() {
		return attribution;
	}
	public void setAttribution(String attribution) {
		this.attribution = attribution;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "jsonAddress [type=" + type + ", version=" + version + ", features=" + features.toString() + ", attribution="
				+ attribution + ", licence=" + licence + ", query=" + query + ", limit=" + limit + "]";
	}
	
	

}
