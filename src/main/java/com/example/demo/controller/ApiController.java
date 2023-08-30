package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
   @Autowired
   ApiService as;
   
   @PostMapping("post")
   public Bike post2(@RequestBody Bike b)
   {
	   return as.post1(b);
   }
   
   @GetMapping("bikename/{s}")
   public List<Bike> get2(@PathVariable String s)
   {
	   return as.get1(s);
   }
}