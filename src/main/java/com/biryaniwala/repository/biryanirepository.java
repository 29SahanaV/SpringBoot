package com.biryaniwala.repository;

import java.util.List;

import com.biryaniwala.model.biryani;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface biryanirepository extends JpaRepository<biryani,Integer> {

//	//retrive by biryani type
//	List<biryani> findByBiryaniType(String btype);
//
//	//retrive by range of biryani by using query
//	@Query(value="select * from biryani where biryani_price< ?1", nativeQuery=true)
//	List<biryani> findByBiryaniPrice(int bprice);  
}