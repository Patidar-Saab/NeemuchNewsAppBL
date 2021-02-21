package com.self.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.self.news.domain.UserMaster;
import com.self.news.exception.CommonException;
import com.self.news.repository.UserRepository;
import static com.self.news.statusCodes.StatusCodes.USER_NOT_FOUND;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;

	public UserMaster loadByUsername(String username, int senderEntity) {

		List<UserMaster> user = userRepository.findByMsisdnOrEmailIdOrUserLoginMaster_username(username, username,
				username);

		if (user == null || user.isEmpty())
			throw new CommonException("User does not exists....", USER_NOT_FOUND);

		return user.stream().filter(obj -> obj.getEntity() == senderEntity).findFirst()
				.orElseThrow(() -> new CommonException("User does not exists.", USER_NOT_FOUND));
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}

}
