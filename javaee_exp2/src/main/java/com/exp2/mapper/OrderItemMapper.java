package com.exp2.mapper;

import com.exp2.model.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper {
    int createOrderItem(OrderItem orderItem);
}
