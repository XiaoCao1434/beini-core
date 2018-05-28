/**
 * 
 */
package com.beini.core.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * @author lb_chen
 *
 */
public class QQProperties extends SocialProperties {
	
	private String providerId = "qq";

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	
}
