package com.prc.coffeeorder.service;

import com.prc.coffeeorder.domain.CreateOrder;
import com.prc.coffeeorder.domain.Order;
import com.prc.coffeeorder.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void newOrder(CreateOrder createOrder) {
        Order entity = Order.newOrder(createOrder);
        orderRepository.save(entity);
    }
}
