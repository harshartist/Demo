package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<BillModel, Integer> {

	
	public BillModel findById(long id);

	public void deleteById(long id);

}
