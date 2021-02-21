package com.self.news.beans;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
public class UserPrincipal {

	private String userId;

	private String userName;

	private String msisdn;

	private String email;

	// @JsonIgnore
	private String password;

	private int entity;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEntity() {
		return entity;
	}

	public void setEntity(int entity) {
		this.entity = entity;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public UserPrincipal(String userId, String userName, String msisdn, String email, String password, int entity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.msisdn = msisdn;
		this.email = email;
		this.password = password;
		this.entity = entity;
	}

	public UserPrincipal() {
		super();
	}

}
