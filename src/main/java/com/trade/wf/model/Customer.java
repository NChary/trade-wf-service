package com.trade.wf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@NotEmpty(message="Email Id is mandatory")
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="address")
	private String address;
	
	@NotEmpty(message="Contact Number is mandatory")
	@Column(name="contact_number")
	private String contactNumber;
		
}
