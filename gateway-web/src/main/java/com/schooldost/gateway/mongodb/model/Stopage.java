/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "stopage" )
public class Stopage extends Base {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5167424725929080547L;
	
	private String stopageName;
	private String pickupTime;
	private String dropTime;
	public String getStopageName() {
		return stopageName;
	}
	public void setStopageName(String stopageName) {
		this.stopageName = stopageName;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getDropTime() {
		return dropTime;
	}
	public void setDropTime(String dropTime) {
		this.dropTime = dropTime;
	}
	@Override
	public String toString() {
		return "Stopage [stopageName=" + stopageName + ", pickupTime=" + pickupTime + ", dropTime=" + dropTime + "]";
	}
	
}
