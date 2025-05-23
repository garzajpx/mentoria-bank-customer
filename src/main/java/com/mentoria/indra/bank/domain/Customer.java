package com.mentoria.indra.bank.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 * 
 */
@Entity
@Table(name = "customer", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cust_id", unique = true, nullable = false)
	@NotNull
	private Integer custId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doty_id")
	@NotNull
	private DocumentType documentType;

	@Column(name = "address", nullable = false)
	@NotNull
	@Size(min = 3, max = 100)
	private String address;

	@NotNull
	@Email
	@Column(name = "email", nullable = false)
	private String email;

	@NotNull
	@Size(min = 1,max = 1)
	@Column(name = "enable", nullable = false)
	private String enable;

	@NotNull
	@Size(min = 1,max = 100)
	@Column(name = "name", nullable = false)
	private String name;

	@NotNull
	@Size(min = 1,max = 100)
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@NotNull
	@Size(min = 1,max = 100)
	@Column(name = "token")
	private String token;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	private List<Account> accounts = new ArrayList<>();
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	private List<RegisteredAccount> registeredAccounts = new ArrayList<>();

}