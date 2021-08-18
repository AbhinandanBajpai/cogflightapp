package com.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;


import com.flight.entity.FlightList;
@EnableJpaRepositories
public interface FlightListRpository extends JpaRepository<FlightList, Integer>{
//	@Query("SELECT u FROM User u WHERE u.fromDestination = :fromDestination and u.toDestination = :toDestination")
//    List<FlightList> searchFlight(@Param("fromDestination") String fromDestination, @Param("toDestination") String toDestination);

//	@Query("SELECT * FROM FlightList")
//	List<FlightList> findByFromDestination(@Param("fromDestination") String fromDestination);
	
//	@Query(value = "Select * from COMMENT C Where C.post_id	= :pId", nativeQuery = true)
//	  List<Comment> findByPostId(@Param("pId") Long pId);
	
	@Query(value = "select * from flight_list u where u.from_destination = :fromDestination and u.to_destination =:toDestination",nativeQuery = true)
	  List<FlightList> findByFromDestination(@Param("fromDestination") String fromDestination, @Param("toDestination") String toDestination);
}
