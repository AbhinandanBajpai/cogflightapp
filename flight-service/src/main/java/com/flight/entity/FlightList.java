package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int flightNumber;
	private String airline;
	private String fromDestination;
	private String toDestination;
	private String arrivalTime;
	private String departuerTime;
	private int numOfBusSeats;
	private int numOfEcoSeats;
	private int ticketCost;
	private boolean block =false;
	public FlightList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightList(int id, int flightNumber, String airline, String fromDestination, String toDestination,
			String arrivalTime, String departuerTime, int numOfBusSeats, int numOfEcoSeats, int ticketCost,
			boolean block) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.fromDestination = fromDestination;
		this.toDestination = toDestination;
		this.arrivalTime = arrivalTime;
		this.departuerTime = departuerTime;
		this.numOfBusSeats = numOfBusSeats;
		this.numOfEcoSeats = numOfEcoSeats;
		this.ticketCost = ticketCost;
		this.block = block;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
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
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartuerTime() {
		return departuerTime;
	}
	public void setDepartuerTime(String departuerTime) {
		this.departuerTime = departuerTime;
	}
	public int getNumOfBusSeats() {
		return numOfBusSeats;
	}
	public void setNumOfBusSeats(int numOfBusSeats) {
		this.numOfBusSeats = numOfBusSeats;
	}
	public int getNumOfEcoSeats() {
		return numOfEcoSeats;
	}
	public void setNumOfEcoSeats(int numOfEcoSeats) {
		this.numOfEcoSeats = numOfEcoSeats;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
	@Override
	public String toString() {
		return "FlightList [id=" + id + ", flightNumber=" + flightNumber + ", "
				+ (airline != null ? "airline=" + airline + ", " : "")
				+ (fromDestination != null ? "fromDestination=" + fromDestination + ", " : "")
				+ (toDestination != null ? "toDestination=" + toDestination + ", " : "")
				+ (arrivalTime != null ? "arrivalTime=" + arrivalTime + ", " : "")
				+ (departuerTime != null ? "departuerTime=" + departuerTime + ", " : "") + "numOfBusSeats="
				+ numOfBusSeats + ", numOfEcoSeats=" + numOfEcoSeats + ", ticketCost=" + ticketCost + ", block=" + block
				+ "]";
	}
	
	
	
	
	
}
