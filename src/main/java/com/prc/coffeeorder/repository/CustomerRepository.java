package com.prc.coffeeorder.repository;

import com.prc.coffeeorder.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
