package com.trade.wf.service;

import java.util.List;

import com.trade.wf.model.ApiResponse;
import com.trade.wf.model.Customer;

public interface CustomerService {
	ApiResponse saveCustomer(Customer customer);
	List<Customer> getAllCustDetails();
	String updateCustomer(Customer customer);
	String deleteCustomer(Customer customer);
	String deleteCustomerById(Integer custId);
	List<Customer> getAllCustDetailsByAddress(String address);
}
