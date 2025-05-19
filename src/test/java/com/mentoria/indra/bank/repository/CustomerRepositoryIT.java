package com.mentoria.indra.bank.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mentoria.indra.bank.domain.Customer;
import com.mentoria.indra.bank.domain.DocumentType;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class CustomerRepositoryIT {
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	DocumentTypeRepository documentTypeRepository;

	@Test
	void debeValidarLasDependencias() {
		assertNotNull(customerRepository);
		assertNotNull(documentTypeRepository);
		
	}
	
	@Test
	void debeCrearUnCustomer() {
		// Arrange
		Integer idDocumentType = 1;
		Integer idCustomer = 14836554;
		
		Customer customer = null;
		DocumentType documentType = documentTypeRepository.findById(idDocumentType).get();
		
		customer = new Customer();
		customer.setAddress("Avenida siempre viva 123");
		customer.setCustId(idCustomer);
		customer.setDocumentType(documentType);
		customer.setEmail("hjsimpson@gmail.com");
		customer.setEnable("Y");
		customer.setName("Homero J Simpson");
		customer.setPhone("55555555");
		customer.setToken("asdfadsfadsfadsgadsgasd");
		// Act
		
		customer = customerRepository.save(customer);
		// Assert
		
		assertNotNull(customer, "El objeto Customer está vacío");
		
	}

}
