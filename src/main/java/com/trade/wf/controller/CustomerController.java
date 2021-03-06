package com.trade.wf.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trade.wf.model.ApiResponse;
import com.trade.wf.model.Customer;
import com.trade.wf.service.CustomerService;

@RestController
@RequestMapping("/v1")
public class CustomerController {

	//Instance or reference of CustomerService
	@Autowired // Object of a class CustomerService object = new CustomerService();  Memory will be created on JVM;  Spring Core Continer
	@Qualifier("customer")
	CustomerService customerService; // It will go to Database
	
	
	@Autowired
	@Qualifier("customertest")
	CustomerService customerService1; // Returning from method only
	
		
	@GetMapping("/greet")
	public String greeting() {
		return "CustomerController";
	}
	
	//Save - http - Header and Body posting service
	@PostMapping("/customer")
	public ApiResponse saveCustomerData(@Valid @RequestBody Customer customer) {
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
	
	@GetMapping("/customer/{address}")
	public List<Customer> getAllCustomersByAddress(@PathVariable final String address){
		return customerService.getAllCustDetailsByAddress(address);
	}
}






