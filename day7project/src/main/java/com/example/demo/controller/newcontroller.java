package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.newmodel;
import com.example.demo.service.newservice;

@RestController
public class newcontroller {
	@Autowired
	public newservice dserv;
	//posting data
	@PostMapping("/insertingValue")
	public String insertingValue(@RequestBody newmodel d)
	{
		dserv.posting(d);
		return "Your data is saved successfully";
	}
	//getting data
	@GetMapping("/gettingValue")
	public List<newmodel> gettingValue()
	{
		return dserv.getting();
	}
	//get all row
		@GetMapping("/getAllrows")
		public List<newmodel> getAllRows()
		{
			return dserv.getAllRows();
		}
		//get data
		@GetMapping("/getSpecrows/{addr}/{name}")
		public List<newmodel> getSpecrows(@PathVariable("addr") String addr,@PathVariable ("name") String name)
		{
			return dserv.getSpecrows(addr, name);
		}
		//get data by char
		@GetMapping("/getByName/{char}")
		public List<newmodel> getByName(@PathVariable("char") String name)
		{
			return dserv.getDataByChar(name);
		}
		//delete data
		@DeleteMapping("/deleteRow/{id}")
		public String deleteRow(@PathVariable("id") int id)
		{
			return dserv.deleteById(id)+" deleted";
		}
		//update the data
		@PutMapping("updateData/{address}/{id}")
		public String updateData(@PathVariable("address") String addr,@PathVariable("id") int id)
		{
			return dserv.updateData(addr, id)+" data is updated";
		}
		//get by model class
		@GetMapping("getting")
		public List<newmodel> getting()
		{
			return dserv.gettingmodel();
		}
		//get by model class
		@GetMapping("/getByModel/{name}")
		public List<newmodel>  getByModel(@PathVariable("name") String name)
		{
			return dserv.getDatafromModel(name);
		}
		//get data
		@GetMapping("/getSpecrowsbymodel/{addr}/{name}")
		public List<newmodel> getSpecrowsbymodel(@PathVariable("addr") String addr,@PathVariable ("name") String name)
		{
			return dserv.getSpecrowsmodel(addr, name);
		}
		//delete using model class
		@DeleteMapping("/delete/{id}")
		public int delete(@PathVariable("id") int id)
		{
			return dserv.deleteUsingmodel(id);
		}
		//update the data
		@PutMapping("updateDatabymodel/{address}/{id}")
		public String updateDatabymodel(@PathVariable("address") String addr,@PathVariable("id") int id)
		{
			return dserv.updateDatamodel(addr, id)+" data is updated";
		}


}