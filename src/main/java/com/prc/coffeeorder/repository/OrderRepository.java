package com.prc.coffeeorder.repository;

import com.prc.coffeeorder.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
