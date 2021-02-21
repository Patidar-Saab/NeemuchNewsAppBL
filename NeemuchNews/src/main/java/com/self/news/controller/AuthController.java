package com.self.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.news.beans.LoginRequest;
import com.self.news.beans.UserPrincipal;
import com.self.news.service.CustomUserDetailsService;
import com.self.news.service.ManageLogin;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@RestController
@RequestMapping("v1/api/auth")
public class AuthController {

	@Autowired
	ManageLogin mangeLogin;

	@Autowired
	CustomUserDetailsService customUserDetailsService;

	/** Admin Login. **/
	@PostMapping(value = "/admin/signin", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserPrincipal> adminLogin(@RequestBody LoginRequest loginRequest) {

		UserPrincipal userPrincipal = mangeLogin.loginAdmin(loginRequest.getUsername(), loginRequest.getPassword());

		return new ResponseEntity<UserPrincipal>(userPrincipal, HttpStatus.OK);
	}

}
