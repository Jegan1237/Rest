package com.example.demo.repository;





import org.springframework.data.jpa.repository.JpaRepository;





import com.example.demo.model.Hellomodel;





public interface Hellorep extends JpaRepository<Hellomodel, Integer> {

	

}

