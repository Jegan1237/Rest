package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demo.model.ApplianceBook;



public interface AppRepo extends JpaRepository<ApplianceBook, Integer>{



}