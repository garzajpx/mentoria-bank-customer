package com.mentoria.indra.bank.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mentoria.indra.bank.domain.Customer;
import com.mentoria.indra.bank.dto.CustomerDTO;




@Mapper
public interface CustomerMapper {	
	
	@Mapping(source = "documentType.dotyId" , target ="dotyId" )
	public CustomerDTO customerToCustomerDTO(Customer customer);
	
	@Mapping(target = "documentType.dotyId" , source ="dotyId" )
	public Customer customerDTOtoCustomer(CustomerDTO customerDTO);
	
	public List<CustomerDTO> customerListToCustomerDTOList(List<Customer> customers);
	
	public List<Customer> customerDTOListToCustomerList(List<CustomerDTO> customerDTOs);

}
 