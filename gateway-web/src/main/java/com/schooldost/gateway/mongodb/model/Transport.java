/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "transport" )
public class Transport extends Base {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5370191015345795868L;
	private String routeNumber;
	private String routeName;
	private Bus bus;
	private Stopage source;
	private Stopage destination;
	private Set<Stopage> stopages;
	private User driver;
	public String getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Stopage getSource() {
		return source;
	}
	public void setSource(Stopage source) {
		this.source = source;
	}
	public Stopage getDestination() {
		return destination;
	}
	public void setDestination(Stopage destination) {
		this.destination = destination;
	}
	public Set<Stopage> getStopages() {
		return stopages;
	}
	public void setStopages(Set<Stopage> stopages) {
		this.stopages = stopages;
	}
	public User getDriver() {
		return driver;
	}
	public void setDriver(User driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "Transport [routeNumber=" + routeNumber + ", routeName=" + routeName + ", bus=" + bus + ", source="
				+ source + ", destination=" + destination + ", stopages=" + stopages + ", driver=" + driver + "]";
	}
	
	
}
