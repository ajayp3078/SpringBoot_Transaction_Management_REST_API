package com.springboottransactiondemo.service;

import com.springboottransactiondemo.dto.OrderRequest;
import com.springboottransactiondemo.dto.OrderResponse;

public interface OrderService {
    OrderResponse placeOrder(OrderRequest orderRequest);
}
