 package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.newmodel;

import com.example.demo.repository.newrep;

@Service
public class newservice {
	@Autowired
	public newrep drepo;
	//post data
	public String posting(newmodel d)
	{
		drepo.save(d);
		return "Your data is saved successfully";
	}
	//get data
	public List<newmodel> getting()
	{
		return drepo.findAll();
	}

	//get all data
	public List<newmodel> getAllRows()
	{
		return drepo.getAllRows();
	}
	//get Spec data
	public List<newmodel> getSpecrows(String addr,String name)
	{
		return drepo.getSpecRows(addr, name);
	}
	//get by Char
	public List<newmodel> getDataByChar(String name)
	{
		return drepo.getByname(name);
	}
	//delete the data
	public int deleteById(int id)
	{
		return drepo.deleteId(id);
	}
	//update the data 
	public int updateData(String addr,int no_id) {
		return drepo.updateById(addr, no_id);
	}
	//get using model class
	public List<newmodel> gettingmodel()
	{
		return drepo.get();
	}
	//get using model class
	public List<newmodel> getDatafromModel(String name)
	{
		return drepo.getByName(name);
	}
	// get specific data
    public List<newmodel> getSpecrowsmodel(String addr,String name)
	{
		return drepo.getSpecRowsBymodel(addr, name);
	}
	//delete using model class
	public int deleteUsingmodel(int id)
	{
		return drepo.deleteBymodel(id);
	}
	//updete by model
	public int updateDatamodel(String addr,int no_id) {
		return drepo.updateByIdmodel(addr, no_id);
	}

}