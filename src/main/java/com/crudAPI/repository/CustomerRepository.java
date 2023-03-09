package com.crudAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudAPI.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

