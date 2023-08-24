package com.example.demo.service;





import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



import com.example.demo.model.Hellomodel;

import com.example.demo.repository.Hellorep;



@Service

public class helloService {

	@Autowired

	Hellorep frepo;

	

	public Hellomodel saveDetails(Hellomodel p)

	{

		return frepo.save(p);

	}

	

	public List<Hellomodel> sortByAsc(String name)

	{

		return frepo.findAll(Sort.by(name).ascending());

	}
	
	


	public List<Hellomodel> sortByDesc(String name) {
		return frepo.findAll(Sort.by(name).descending());
	}
	public List<Hellomodel> pagination(int no,int size)

  	{

  		Page<Hellomodel> count = frepo.findAll(PageRequest.of(no, size));

  		return count.getContent();

  	}

  	

  	//pagination and sorting

  	public List<Hellomodel> paginationAndSort(int no,int size,String name)

  	{

  		Page<Hellomodel> count1 = frepo.findAll(PageRequest.of(no, size, Sort.by(name)));

  		return count1.getContent();

  	}

}