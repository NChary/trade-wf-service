package com.trade.wf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.trade.wf.model.ApiResponse;
import com.trade.wf.model.Customer;
@Service
@Qualifier("customertest")
public class CustomerServiceTest implements CustomerService{

	@Override
	public ApiResponse saveCustomer(Customer customer) {
		return ApiResponse.builder().message("It is from CustomerService Test class").build();
	}

	@Override
	public List<Customer> getAllCustDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomerById(Integer custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustDetailsByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

}
