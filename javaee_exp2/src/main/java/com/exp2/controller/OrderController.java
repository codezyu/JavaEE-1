package com.exp2.controller;

import com.exp2.model.Order;
import com.exp2.model.OrderItem;
import com.exp2.service.OrderItemService;
import com.exp2.service.OrderService;
import com.exp2.util.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    OrderItemService orderItemService;

    @GetMapping("/{id}")
    public Object getOrderInfo(@PathVariable("id") Long id)
    {
        return orderService.findById(id);
    }

    @PostMapping("")
    public Object createOrder(@RequestBody Order orderInfo)
    {
        Long orderId = orderService.createOrder(orderInfo);
        List<OrderItem> orderItems = orderInfo.getOrderItems();
        for(OrderItem orderItem:orderItems) {
            orderItem.setOrderId(orderId);
            orderItemService.createOrderItem(orderItem);
        }
        return new ReturnObject<String>("插入成功");
    }
}
