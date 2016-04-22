/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "bus" )
public class Bus extends Base {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3716797972201669866L;
	private String busNumber;
	private String capacity;
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", capacity=" + capacity + "]";
	}
	
}
