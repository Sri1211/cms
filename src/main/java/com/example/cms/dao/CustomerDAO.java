package com.example.cms.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.cms.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer> {
}
