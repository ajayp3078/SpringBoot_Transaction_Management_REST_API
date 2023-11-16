package com.springboottransactiondemo.dto;

import com.springboottransactiondemo.entity.Order;
import com.springboottransactiondemo.entity.Payment;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {
    private Order order;
    private Payment payment;
}
