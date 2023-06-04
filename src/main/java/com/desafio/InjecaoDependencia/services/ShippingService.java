package com.desafio.InjecaoDependencia.services;

import org.springframework.stereotype.Service;

import com.desafio.InjecaoDependencia.entities.Order;

@Service
public class ShippingService {

    private static double calculaValorFrete(double valorBasico) {
        if (valorBasico < 100.00) {
            return 20.00;
        } else if (valorBasico >= 100.00 && valorBasico <= 200.00) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
    
    public double shipment(Order order) {
        double valorBasico = order.getBasic();
        
        return calculaValorFrete(valorBasico);
    }
    
}
