package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.FlightList;
import com.flight.exception.FlightNotFoundException;
import com.flight.model.SearchForm;
import com.flight.service.FlightListService;

@RestController
//@RequestMapping("/flight")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin("*")
public class FlightListController {

	@Autowired
	private FlightListService flightListService;
	
	@GetMapping("")
	public List<FlightList> getAllFlight(){
		return flightListService.getAllFlight();
	}
	
	@PostMapping("")
	public FlightList saveFlaight(@RequestBody FlightList list) {
		return flightListService.saveAllFlight(list);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFlightById(@PathVariable int id) {
		flightListService.deleteFlightById(id);
	}
//	@GetMapping("")
//	public FlightList getFlightById( @RequestBody FlightList flightList) {
//		return flightListService.getFlightById(flightList);
//	
//	}
	
	@PutMapping("/{id}")
	public ResponseEntity<FlightList> blockFlight(@PathVariable int id) throws FlightNotFoundException {
		return flightListService.blockFlight(id);
	}
	
	
//	///////////////////////////////////////////////////////////////////////////////
	
	
	//Flight Module
//	@GetMapping("/searchFlight")
//	public List<FlightList> searchFlight(@RequestParam("fromDestination") String fromDestination, @RequestParam("toDestination") String toDestination){
//		System.out.println("FlightSearching is being performed");
//		System.out.println(fromDestination+"   "+toDestination);
//		return flightListService.searchFlight(fromDestination,toDestination);
//	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/search")
	public List<FlightList> search(@RequestParam("fromDestination") String fromDestination, @RequestParam("toDestination") String toDestination){
	
		return flightListService.findByFromDestination(fromDestination, toDestination);
	}
}
