package com.crudAPI.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="Noorders")
	private Integer Noorders;
	
	@OneToMany(mappedBy = "customer_here" , cascade = CascadeType.ALL)
	private Set <Order> orders;

	
	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getNoorders() {
		return Noorders;
	}

	public void setNoorders(Integer Noorders) {
		this.Noorders = Noorders;
	}

	

	public Customer(Long id, String name, String gender, Integer noorders, Set<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.Noorders = noorders;
		this.orders = orders;
	}

	public Customer()
	{
		//Aarti Rathi
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", Noorders=" + Noorders + ", orders="
				+ orders + "]";
	}

	
	
}

