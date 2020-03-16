package com.tdn.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdn.billingsoftware.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
