package com.self.news.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.self.news.domain.UserMaster;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@Repository
public interface UserRepository extends CrudRepository<UserMaster, String>, JpaSpecificationExecutor<UserMaster> {

	List<UserMaster> findByMsisdnOrEmailIdOrUserLoginMaster_username(String msisdn, String emailId,
			String username);

}
