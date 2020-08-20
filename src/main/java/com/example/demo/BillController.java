package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class BillController {
	
	@Autowired
	BillRepository repo;
	
	@GetMapping("/api/v1/bill")
	public List<BillModel> getAllBills() {
		List<BillModel> billList= new ArrayList<>();
		billList= repo.findAll();
		return billList;
	}
	
	@PostMapping("/api/v1/bill")
	@Transactional
	public BillModel createNewBill(@RequestBody BillModel billModel) 
	{
		BillModel model= repo.save(billModel);
		return model;
	}
	
	@DeleteMapping("/api/v1/bill/{id}")
	@Transactional
	public void deleteBillModel(@PathVariable long id) {
		repo.deleteById((int) id);
		
	}
	@GetMapping("/api/v1/bill/name/{name}")
	public BillModel getBillByName(String name) {
		
		return null;
	}

}
