package com.flight.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flight.entity.FlightList;
import com.flight.exception.FlightNotFoundException;
import com.flight.repository.FlightListRpository;

@Service
public class FlightListService {

	@Autowired
	private FlightListRpository flightListRepository;
	
	public List<FlightList> getAllFlight(){
		return flightListRepository.findAll();
	}
	
	public FlightList saveAllFlight(FlightList list) {
		return flightListRepository.save(list);
	}
	
	public void deleteFlightById(int id) {
		flightListRepository.deleteById(id);
	}
	
	public FlightList getFlightById(FlightList flightList) {
		  Optional<FlightList> findById = flightListRepository.findById(flightList.getId());
		  return findById.get();
	}
	
	public ResponseEntity<FlightList> blockFlight(int id) throws FlightNotFoundException {
		 Optional<FlightList> flightList2 = flightListRepository.findById(id);
		 
		 if(flightList2.isPresent()) {
			 
			 flightListRepository.save(flightList2.get());
			 return new ResponseEntity<FlightList>(HttpStatus.OK);
		 }else {
			 throw new FlightNotFoundException("Flight With id "+id+" has not found");
		 }
		

	}
//	public FlightList blockFlight(int id) {
//		FlightList flightList2 = flightListRepository.findById(id).get();
//		
//		if(flightList2.isBlock()) {
//			flightList2.setBlock(false);
//		}else {
//			flightList2.setBlock(true);
//		}
//		return flightListRepository.save(flightList2);
//	}
	
	
	///////////////////////////////////////////////////////////////////////
	
	//Flight Module
//	
//	public List<FlightList> searchFlight(String fromDestination, String toDestination){
//		
//		return flightListRepository.searchFlight(fromDestination, toDestination);
//		
////		return flightListRepository.FindByfromDestinationAndtoDestination();
//	}
	
//	public List<FlightList> search(String fromDestination){
//		return flightListRepository.findByFromDestination(fromDestination);
//	}
	
	public List<FlightList> findByFromDestination(String fromDestination, String toDestination){
		 return flightListRepository.findByFromDestination(fromDestination, toDestination);
	}
}
