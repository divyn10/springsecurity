package com.ss.repository;

import com.ss.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository1 extends CrudRepository<Customer, Long> {
    List<Customer> findByEmail(String email);
}
