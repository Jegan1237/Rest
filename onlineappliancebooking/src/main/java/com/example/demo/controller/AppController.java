package com.example.demo.controller;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.ApplianceBook;

import com.example.demo.service.AppService;



@RestController

public class AppController {

	@Autowired

	public AppService appserv;

	

	//post mapping

	@PostMapping("/postHotel")

	public String postHotel(@RequestBody ApplianceBook hr)

	{

		appserv.saveHotel(hr);

		return "Data saved";

	}

	

	//get mapping

	@GetMapping("/getHotel")

	public List<ApplianceBook> getHotelInfo()

	{

		return appserv.getHotel();

	}

	

	//put mapping

	@PutMapping("/updateHotel")

	public ApplianceBook updateHotelInfo(@RequestBody ApplianceBook ha)

	{

		return appserv.updateHotel(ha);

	}

	

	//delete mapping using path variable

	@DeleteMapping("/deleteHotel/{id}")

	public String removeHotel(@PathVariable("id") int hid)

	{

		appserv.deleteHotel(hid);

		return "Hotel with Id"+hid+" is deleted";

	}

	

	//delete mapping using request param

	@DeleteMapping("/byReqParm")

	public String removeByRequestPam(@RequestParam("id") int id)

	{ 

		appserv.deleteHotel(id);

		return "Hotel with Id "+id+" is deleted"; 

	}

	

	

	//delete mapping with present or not

	@DeleteMapping("/deletehotelif/{id}")

	public ResponseEntity<String>deletehotelinfo(@PathVariable int id)

	{

		boolean deleted=appserv.deletehotelinfo(id);

		if(deleted)

		{

			return ResponseEntity.ok("Hotel with ID "+ id +" deleted successfully");

		}

		else

		{

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID "+ id +" not found");

		}

	}

	

	//getuserById

		@GetMapping("/users/{userId}")

		public ResponseEntity<?>getUserId(@PathVariable int userId)

		{

		Optional<ApplianceBook>hotel=appserv.getUserId(userId);

		if(hotel!=null) {

			return ResponseEntity.ok(hotel); //return the users data if available

		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID");

			

		}

}