package com.mentoria.indra.bank.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zathura Code Generator Version 9.0 http://zathuracode.org/
 *         www.zathuracode.org
 *
 */
@Entity
@Table(name = "transaction", schema = "public")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tran_id", unique = true, nullable = false)
	private Integer tranId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "acco_id")
	private Account account;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trty_id")
	private TransactionType transactionType;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_email")
	private Users users;

	@Column(name = "amount", nullable = false)
	private Double amount;

	@Column(name = "date", nullable = false)
	private Date date;
}
