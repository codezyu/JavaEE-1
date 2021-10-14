package com.exp2.service;

import com.exp2.mapper.OrderItemMapper;
import com.exp2.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
    @Autowired
    OrderItemMapper orderItemMapper;

    public int createOrderItem(OrderItem orderItem)
    {
        return orderItemMapper.createOrderItem(orderItem);
    }
}
