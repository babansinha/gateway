/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "address" )
public class Address extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2575449612641666677L;
	protected String city;
	protected String state;
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
}
