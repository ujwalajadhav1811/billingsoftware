package com.tdn.billingsoftware.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdn.billingsoftware.model.Customer;
import com.tdn.billingsoftware.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerRepository customerepository;
	
	
	public List<Customer> listAll() {
        return customerepository.findAll();
    }
	
	public void saveCustomer(Customer customer)
	{
		customerepository.save(customer);
	}
	
}


