package com.trade.wf.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.trade.wf.exception.CustomerNotFoundException;
import com.trade.wf.model.ApiResponse;
import com.trade.wf.model.Customer;
import com.trade.wf.repo.CustomerRepository;
import com.trade.wf.util.TradeWfUtil;

@Service
@Qualifier("customer")
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

	@Override
	public List<Customer> getAllCustDetailsByAddress(String address) {

		Optional<List<Customer>> lstOptCustomer = custRepository.findByCustomerAddress(address);

		if(lstOptCustomer.isPresent()) {
			List<Customer> lstCustomers = lstOptCustomer.get();
			if(!lstCustomers.isEmpty()) {
				return lstCustomers;
			}else {
				throw new CustomerNotFoundException("Customer(s) not found in the given address");
			}
		}
		return new ArrayList<>();
	}

}
