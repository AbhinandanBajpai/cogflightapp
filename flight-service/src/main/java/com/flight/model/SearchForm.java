package com.flight.model;

public class SearchForm {

	private String fromDestination;
	private String toDestination;
	private String departing;
	private String abc;
	public SearchForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchForm(String fromDestination, String toDestination, String departing, String abc) {
		super();
		this.fromDestination = fromDestination;
		this.toDestination = toDestination;
		this.departing = departing;
		this.abc = abc;
	}
	public String getFromDestination() {
		return fromDestination;
	}
	public void setFromDestination(String fromDestination) {
		this.fromDestination = fromDestination;
	}
	public String getToDestination() {
		return toDestination;
	}
	public void setToDestination(String toDestination) {
		this.toDestination = toDestination;
	}
	public String getDeparting() {
		return departing;
	}
	public void setDeparting(String departing) {
		this.departing = departing;
	}
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	@Override
	public String toString() {
		return "SearchForm [" + (fromDestination != null ? "fromDestination=" + fromDestination + ", " : "")
				+ (toDestination != null ? "toDestination=" + toDestination + ", " : "")
				+ (departing != null ? "departing=" + departing + ", " : "") + (abc != null ? "abc=" + abc : "") + "]";
	}
	
	
}
