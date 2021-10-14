package com.exp2.service;

import com.exp2.mapper.OrderMapper;
import com.exp2.model.Order;
import com.exp2.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public ReturnObject<Order> findById(Long id) {
        Order order = orderMapper.findOrderById(id);
        return new ReturnObject<>(order);
    }

    public Long createOrder(Order orderInfo) {
        return orderMapper.createOrder(orderInfo);
    }
}
