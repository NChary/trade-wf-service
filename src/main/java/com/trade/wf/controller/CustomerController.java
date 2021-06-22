package com.trade.wf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trade.wf.model.Customer;
import com.trade.wf.service.CustomerService;

@RestController
@RequestMapping("/v1")
public class CustomerController {

	//Instance or reference of CustomerService
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/greet")
	public String greeting() {
		return "CustomerController";
	}
	
	//Save - http - Header and Body posting service
	@PostMapping("/customer")
	public String saveCustomerData(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustDetails();
	}
	
	@PutMapping("/customer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@DeleteMapping("/customer")
	public String deleteCustomer(@RequestBody Customer customer) {
		return customerService.deleteCustomer(customer);
	}
	
	@DeleteMapping("/customer/{custId}")
	public String deleteByCustomerId(@PathVariable final Integer custId) {
		return customerService.deleteCustomerById(custId);
	}
	
}






