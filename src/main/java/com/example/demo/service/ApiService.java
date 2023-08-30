package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class ApiService {
    @Autowired
    BikeRepo br;
    
    public Bike post1(Bike b)
    {
    	return  br.save(b);
    }
    
    public List<Bike> get1(String s)
    {
    	return br.getBike(s);
    }
}