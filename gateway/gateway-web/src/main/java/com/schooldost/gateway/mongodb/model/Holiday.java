/**
 * 
 */
package com.schooldost.gateway.mongodb.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author baban_sinha
 *
 */
@Document(collection = "holiday" )
public class Holiday extends Base {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3094925901970839777L;
	private String title;
	private String startDate;
	private String endDate;
	private String holidayDescription;
	private boolean read;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the holidayDescription
	 */
	public String getHolidayDescription() {
		return holidayDescription;
	}
	/**
	 * @param holidayDescription the holidayDescription to set
	 */
	public void setHolidayDescription(String holidayDescription) {
		this.holidayDescription = holidayDescription;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	
	@Override
	public String toString() {
		return "Holiday [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", holidayDescription="
				+ holidayDescription + ", read=" + read + "]";
	}
	
	
}
