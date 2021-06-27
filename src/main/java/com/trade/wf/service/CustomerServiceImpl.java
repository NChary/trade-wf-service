package com.trade.wf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trade.wf.model.ApiResponse;
import com.trade.wf.model.Customer;
import com.trade.wf.repo.CustomerRepository;
import com.trade.wf.util.TradeWfUtil;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository custRepository;
	
	@Override
	public ApiResponse saveCustomer(Customer customer) {
		custRepository.save(customer);
		return TradeWfUtil.buildApiResponse("000", "SUCCESS", "Successfully saved customer");
	}

	@Override
	public List<Customer> getAllCustDetails() {
		return custRepository.findAll();
	}

	//Update, model should have ID
	@Override
	public String updateCustomer(Customer customer) {
		//Manipulate
		custRepository.save(customer);
		return "Service : "+customer.getCustomerName();
	}

	@Override
	public String deleteCustomer(Customer customer) {
		custRepository.delete(customer);
		return "Deleted....";
	}

	@Override
	public String deleteCustomerById(Integer custId) {
		custRepository.deleteById(custId);
		return "Deleted....";
	}
	
}
