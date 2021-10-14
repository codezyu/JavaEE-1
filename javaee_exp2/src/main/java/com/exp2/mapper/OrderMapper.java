package com.exp2.mapper;

import com.exp2.model.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    Order findOrderById(Long id);
    Long createOrder(Order orderInfo);
}
