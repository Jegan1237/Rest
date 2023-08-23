package com.example.demo.service;



import java.util.List;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.example.demo.model.ApplianceBook;

import com.example.demo.repository.AppRepo;



@Service

public class AppService {

	@Autowired

	public AppRepo apprepo;

	

	//post data

	public String saveHotel(ApplianceBook h)

	{

		apprepo.save(h);

		return "Data is saved to database";

	}

	

	//get data

	public List<ApplianceBook> getHotel()

	{

		return apprepo.findAll();

	}

	

	//update the data

	public ApplianceBook updateHotel(ApplianceBook hm)

	{

		return apprepo.saveAndFlush(hm);

	}

	

	//delete the data

	public void deleteHotel(int id)

	{

		System.out.println("Deleted");

		apprepo.deleteById(id);

	}

	

	public boolean deletehotelinfo(int hotelId)

	{

		if(apprepo.existsById(hotelId))

		{

			apprepo.deleteById(hotelId);

			return true;

		}

		return false;

	}

	

	public Optional<ApplianceBook> getUserId(int userId)

	   {

		   Optional<ApplianceBook>hotel=apprepo.findById(userId);

		   if(hotel.isPresent())

		   {

			   return hotel;

		   }

		   return null;

	   }

	}