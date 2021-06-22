package com.trade.wf.service;

import java.util.List;

import com.trade.wf.model.Customer;

public interface CustomerService {
	String saveCustomer(Customer customer);
	List<Customer> getAllCustDetails();
	String updateCustomer(Customer customer);
	String deleteCustomer(Customer customer);
	String deleteCustomerById(Integer custId);
}
