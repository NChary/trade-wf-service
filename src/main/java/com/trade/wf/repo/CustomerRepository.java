package com.trade.wf.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.trade.wf.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	@Query(value = "SELECT * FROM customer WHERE address=:address",nativeQuery = true)
	Optional<List<Customer>> findByCustomerAddress(String address);
	
}
