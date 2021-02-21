package com.self.news.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@Entity
@Table(name = "mfs_user_master")
public class UserMaster {

	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "ENTITY_TYPE")
	private int entity;

	@Column(name = "MSISDN")
	private String msisdn;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@OneToOne(mappedBy = "userMaster", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private UserLoginMaster userLoginMaster;

	public UserMaster() {
		super();

	}

	public UserMaster(String userId, String firstName, String lastName, int entity, String msisdn, String emailId,
			UserLoginMaster userLoginMaster) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.entity = entity;
		this.msisdn = msisdn;
		this.emailId = emailId;
		this.userLoginMaster = userLoginMaster;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEntity() {
		return entity;
	}

	public void setEntity(int entity) {
		this.entity = entity;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserLoginMaster getUserLoginMaster() {
		return userLoginMaster;
	}

	public void setUserLoginMaster(UserLoginMaster userLoginMaster) {
		this.userLoginMaster = userLoginMaster;
	}

}
