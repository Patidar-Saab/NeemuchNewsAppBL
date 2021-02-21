package com.self.news.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.self.news.statusCodes.StatusCodes.UNAUTH_ACCESS;

import com.self.news.beans.BLDTO;
import com.self.news.beans.Params;
import com.self.news.beans.UserPrincipal;
import com.self.news.domain.UserMaster;
import com.self.news.exception.CommonException;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@Service
public class ManageLogin {

	@Autowired
	BLDTO bldto;

	@Autowired
	Params params;

	@Autowired
	CustomUserDetailsService customUserDetailsService;

	public UserPrincipal loginAdmin(String userName, String password) {

		bldto.setSenderEntity(params.getAdminEntity());

		UserMaster user = getUser(userName);
		if (user.getEntity() != params.getAdminEntity())
			throw new CommonException("Unauthorized access", UNAUTH_ACCESS);

		return execute(userName, password, user);
	}

	private UserPrincipal execute(String userName, String password, UserMaster user) {

		UserPrincipal userPrincipal = new UserPrincipal(user.getUserId(), user.getUserLoginMaster().getUsername(),
				user.getMsisdn(), user.getEmailId(), "404 Not Found", user.getEntity());

		return userPrincipal;
	}

	private UserMaster getUser(String username) {
		UserMaster user = customUserDetailsService.loadByUsername(username, bldto.getSenderEntity());
		return user;
	}

}
