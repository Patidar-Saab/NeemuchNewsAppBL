package com.self.news.beans;

/**
 * @author rahul.patidar
 * @date 21-02-2021
 */
public class LoginRequest {

	private String username;

	private String password;

	public LoginRequest() {
		super();

	}

	public LoginRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
