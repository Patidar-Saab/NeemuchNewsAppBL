package com.self.news.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author rahul.patidar
 * @date 21-Feb-2021
 */
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class BLDTO {
	
	private int senderEntity;

	public int getSenderEntity() {
		return senderEntity;
	}

	public void setSenderEntity(int senderEntity) {
		this.senderEntity = senderEntity;
	}
	
	

}
