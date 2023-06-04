package com.desafio.InjecaoDependencia.services;

import org.springframework.stereotype.Service;

import com.desafio.InjecaoDependencia.entities.Order;

@Service
public class OrderService {
    
    public double total(Order order) {
        double valorBasico = order.getBasic();
        double desconto = order.getDiscount();
        ShippingService shippingValue = new ShippingService();
        
        return (valorBasico - ((valorBasico * desconto) / 100)) + shippingValue.shipment(order);
    }
}
