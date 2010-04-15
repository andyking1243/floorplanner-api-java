package com.floorplanner.rest.beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement
public class User {

	private String username, email, id, countryCode, externalIdentifier, createdAt, measurement, profile, url, accountType, company, currentToken;
    
	public String getCurrentToken() {
		return currentToken;
	}

	@XmlElement(name = "current-token")
	public void setCurrentToken(String currentToken) {
		this.currentToken = currentToken;
	}

	public String getExternalIdentifier() {
		return externalIdentifier;
	}

	public void setExternalIdentifier(String externalIdentifier) {
		this.externalIdentifier = externalIdentifier;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUsername() {
		return username;
	}

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getProfile() {
		return profile;
	}

	public String getUrl() {
		return url;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getCompany() {
		return company;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
