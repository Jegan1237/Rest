package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.ApplianceBook;
import com.example.demo.repository.AppRepo;

@Service
public class AppService {
@Autowired
public AppRepo hrepo;

//post data
public String saveReview(ApplianceBook h)
{
hrepo.save(h);
return "Data is saved to database";
}

//get data
public List<ApplianceBook> getReview()
{
return hrepo.findAll();
}

//update the data
public ApplianceBook updateReview(ApplianceBook hm)
{
return hrepo.saveAndFlush(hm);
}

//delete the data
public void deleteReview(int id)
{
System.out.println("Deleted");
hrepo.deleteById(id);
}

//sorting

public List<ApplianceBook> sortByAsc(String name)
{
return hrepo.findAll(org.springframework.data.domain.Sort.by(name).ascending());
}

//pagination
public List<ApplianceBook> pagination(int pnum,int psize)
{
Page<ApplianceBook> cont=hrepo.findAll(PageRequest.of(pnum, psize));
return cont.getContent();
}

//pagination and sorting
public List<ApplianceBook> paginationAndSorting(int pnum,int psize,String name)
{
Page<ApplianceBook> cont1=hrepo.findAll(PageRequest.of(pnum, psize, Sort.by(name)));
return cont1.getContent();
}
}
