package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer>{
        
	@Query(value = "select * from Bike where bikename=:sn",nativeQuery = true)
	public List<Bike> getBike(@Param("sn") String bikename);
}