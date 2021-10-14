package com.exp2.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("OrderItem")
public class OrderItem {
    private Long skuId;

    private Long orderId;

    private String name;

    private Integer quantity;

    private Long price;

    private Long discount;

    private Long couponActId;

    private Long beShareId;
}
