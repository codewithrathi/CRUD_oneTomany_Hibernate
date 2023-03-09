package com.crudAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column(name="orderName")
	private String orderName;
	
	@Column(name="orderamt")
	private Long orderamt;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer_here;

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Long getOrderamt() {
		return orderamt;
	}

	public void setOrderamt(Long orderamt) {
		this.orderamt = orderamt;
	}

	public Order(Long id, String orderName, Long orderamt) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderamt = orderamt;
	}
	
	public Order()
	{
		// Aarti Rathi
	}

	@Override
	public String toString() {
		return "Order [orderid=" + id + ", orderName=" + orderName + ", orderamt=" + orderamt + "]";
	}
	
	

}
