/**  
* Title: Person.java 
* Description:  
* Copyright: Copyright (c) 2017  
* Company: www.baidudu.com 
* @author xuchang  
* @date 2018年6月14日  
* @version 1.0  
*/  
package com.bclz.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**  
* Title: Person
* Description: 
* @author xuchang 
* @date 2018年6月14日  
*/

@Component
public class Website {
	
	@Value("${wbsite.URL}")
	private String URL;
	
	@Value("#{website.getURL()+'AAA'}")
	private String spEl;
	
	@Value("${wbsite.description}")
	private String description;

	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * @param uRL the uRL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the spEl
	 */
	public String getSpEl() {
		return spEl;
	}

	/**
	 * @param spEl the spEl to set
	 */
	public void setSpEl(String spEl) {
		this.spEl = spEl;
	}
	
	
	
	
}
