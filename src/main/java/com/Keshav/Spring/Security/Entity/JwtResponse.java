package com.Keshav.Spring.Security.Entity;

import lombok.Builder;

@Builder
public class JwtResponse {
	private String JwtToken;
	private String username;
	public String getJwtToken() {
		return JwtToken;
	}
	public void setJwtToken(String jwtToken) {
		JwtToken = jwtToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public JwtResponse(String jwtToken, String username) {
		super();
		JwtToken = jwtToken;
		this.username = username;
	}
	public JwtResponse() {
		super();
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
