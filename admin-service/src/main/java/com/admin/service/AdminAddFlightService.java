//package com.admin.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.admin.entity.FlightList;
//import com.admin.repository.AdminAddFlightRepository;
//@Service
//public class AdminAddFlightService {
//	
//	@Autowired
//	private AdminAddFlightRepository adminAddFlightRepository;
//	
//	
//	public FlightList addFlight(FlightList flight) {
//	
//		return adminAddFlightRepository.save(flight);
//	}
//	
//	public List<FlightList> getAllFlight() {
//		return adminAddFlightRepository.findAll(); 
//	}
//
//}
