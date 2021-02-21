package com.self.news.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@PropertySource("classpath:application.properties")
@Component
public class Params {

	@Value("${admin.entity}")
	private int adminEntity;

	@Value("${customer.entity}")
	private int customerEntity;

	@Value("${pwd.min.length}")
	private int passwordLength;

	public int getAdminEntity() {
		return adminEntity;
	}

	public void setAdminEntity(int adminEntity) {
		this.adminEntity = adminEntity;
	}

	public int getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(int customerEntity) {
		this.customerEntity = customerEntity;
	}

	public int getPasswordLength() {
		return passwordLength;
	}

	public void setPasswordLength(int passwordLength) {
		this.passwordLength = passwordLength;
	}

}
