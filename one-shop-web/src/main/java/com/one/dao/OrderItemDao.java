package com.one.dao;

import com.one.pojo.entity.OrderItem;

public interface OrderItemDao {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);
}