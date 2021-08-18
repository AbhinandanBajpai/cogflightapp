package com.admin.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.admin.entity.FlightList;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/admin")
@EnableSwagger2
public class AdminAddFlightController {

//	@Autowired
//	private AdminAddFlightService adminAddFlightService;
//	
	
	RestTemplate template = new RestTemplate();
	
	
	
	@GetMapping("/flights")
	
	public List<FlightList> getAllFlights(){
		
		ResponseEntity<List<FlightList>> responseEntity = template.exchange(
				"http://localhost:8989/flightList",
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<FlightList>>() {
				});
		
		System.out.println("Admin Is Running");
//		return Arrays.asList(new FlightList());
		return responseEntity.getBody();
	}
	
	@PostMapping("/flights")
	public FlightList saveFlight(@RequestBody FlightList flightList) {
		
		FlightList postForObject = template.postForObject(
				"http://localhost:8989/flightList",
				flightList, FlightList.class
				);
		
		System.out.println("Admin Post Is Running");
		return postForObject;
	}
	
	@DeleteMapping("/flights/{id}")//@RequestBody FlightList flightList
	public void deleteFlightById(@PathVariable int id) {
		System.out.println("Admin Delete Is Running"+ " "+id);
//		template.delete("http://localhost:8989/flightList");
		
		ResponseEntity<Void> exchange = template.exchange(
				"http://localhost:8989/flightList"+"/{id}",
				HttpMethod.DELETE,
				null,
				void.class,
				Integer.toString(id)
				);
	}
	
	@PutMapping("/flights/{id}")
	public FlightList blockFlight(@PathVariable int id) {
		ResponseEntity<FlightList> block = template.exchange(
				"http://localhost:8989/flightList"+"/{id}",
				HttpMethod.PUT,
				null,
				FlightList.class,
				Integer.toString(id));
		
		return block.getBody();
		

	}
//	
//	@PutMapping("/flights/{id}")
//	public ResponseEntity<FlightList> blockFlight(@PathVariable int id) {
//		ResponseEntity<FlightList> block = template.exchange(
//				"http://localhost:8989/flightList"+"/{id}",
//				HttpMethod.PUT,
//				null,
//				FlightList.class,
//				Integer.toString(id));
//		
//		 block.getBody();
//		return;
//	}
	
}
