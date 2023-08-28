package com.example.demo.controller; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.himodel;
import com.example.demo.repository.hirep; 
@RestController 
@RequestMapping("/user") 
public class hicontroller 
{
	@Autowired 
	hirep urepo; 
	@PostMapping("/details")
	public himodel get(@RequestBody himodel s)
	{ 
		return urepo.save(s); 
	}
}