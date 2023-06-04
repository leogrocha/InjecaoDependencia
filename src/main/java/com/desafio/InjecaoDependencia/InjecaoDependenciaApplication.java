package com.desafio.InjecaoDependencia;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.InjecaoDependencia.entities.Order;
import com.desafio.InjecaoDependencia.services.OrderService;

@SpringBootApplication
public class InjecaoDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService service;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DecimalFormat df = new DecimalFormat("#.00");
		Order order = new Order(13, 150.00, 20.00);
		System.out.println("Pedido código: " + order.getOrder());
		System.out.println("Valor total: R$ " + df.format(service.total(order)));
	}

}
