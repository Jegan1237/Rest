package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;



import com.example.demo.model.Hellomodel;

import com.example.demo.service.helloService;



@RestController

public class hellocontroller {



	

	@Autowired

	helloService fser;

	@PostMapping("/saveFuel")

	

	public Hellomodel saveFuelStationDe(@RequestBody Hellomodel pb)

	{

		return fser.saveDetails(pb);

	}

	

	@GetMapping("/sortAsc/{name}")

	public List<Hellomodel> sortasc(@PathVariable("name")String name)

	{

		return fser.sortByAsc(name);

	}
	
	@GetMapping("/sortDesc/{name}")
	public List<Hellomodel> sortdesc(@PathVariable("name") String name)
	{
		return fser.sortByDesc(name);
	}
	@GetMapping("pagination/{number}/{s}")
	public List<Hellomodel> paginationValue(@PathVariable("number") int no,@PathVariable ("s") int size)
	{
	return fser.pagination(no, size);
	}
	//paging and sort
	@GetMapping("paginationdetails/{number}/{s}/{name}")
	public List<Hellomodel> paginationAndSortingValue(@PathVariable("number") int no,@PathVariable ("s") int size,@PathVariable ("name") String name)
	{
	return fser.paginationAndSort(no, size, name);
	}

}