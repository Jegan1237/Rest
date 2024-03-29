 package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.newmodel;

import jakarta.transaction.Transactional;
@Repository
public interface newrep extends JpaRepository<newmodel, Integer> {
	//native Query
		@Query(value = "select * from tamilnadu",nativeQuery = true)
		public List<newmodel> getAllRows();
		@Query(value = "select * from tamilnadu where batch =:addr and name =:name" ,nativeQuery = true)
		public List<newmodel> getSpecRows(@Param("addr") String addr,@Param("name") String name);
		//get by char
		@Query (value = "select * from tamilnadu where name like %?1%",nativeQuery = true)
		public List<newmodel> getByname(@Param("name") String name);
		//delete using native query
		@Modifying
		@Transactional
		@Query(value = "delete from tamilnadu where id=:no_id",nativeQuery = true)
		public int deleteId(@Param("no_id") int id);
		@Modifying
		@Transactional
		@Query(value="update tamilnadu set batch=:addr where id=:no_id",nativeQuery = true)
		public int updateById(@Param("addr") String addr,@Param("no_id") int id);
		//get by using model class
		@Query("select t from day8model t")
		public List<newmodel> get();
		//get by name using model class
	    @Query("select t from  day8model t where t.name like %?1%")
	    public List<newmodel> getByName(@Param("name") String name);
	    
	    //get using id by model class
	    @Query("select t from day8model t where t.batch =:addr and t.name =:name")
		public List<newmodel> getSpecRowsBymodel(@Param("addr") String addr,@Param("name") String name);
	    
	    //delete by name using model
	    @Modifying
	    @Transactional
	    @Query("delete from day8model t where t.no=:id")
	    public int deleteBymodel(@Param("id") int id);
	    

		@Modifying
		@Transactional
		@Query("update day8model t set t.batch=:addr where t.id=:no_id")
		public int updateByIdmodel(@Param("addr") String addr,@Param("no_id") int id);

}