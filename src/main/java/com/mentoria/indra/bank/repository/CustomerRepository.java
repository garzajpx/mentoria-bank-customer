package com.mentoria.indra.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentoria.indra.bank.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	List<Customer> findByEnable(String enable);
	
	List<Customer> findByNameLike(String name);

}
