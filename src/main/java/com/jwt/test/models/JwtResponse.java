package com.jwt.test.models;

public class JwtResponse {
	private String token;

	public JwtResponse(String token) {
		super();
		this.token = token;
	}

	public JwtResponse() {
		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	

}