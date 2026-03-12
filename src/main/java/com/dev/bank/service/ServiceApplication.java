package com.dev.bank.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}

	// @Bean
    // CommandLineRunner testRabbit(RabbitTemplate rabbitTemplate) {
    //     return args -> {
    //         System.out.println(">>> Enviando mensaje de prueba a RabbitMQ...");
    //         rabbitTemplate.convertAndSend("movimientosExchange", "movimiento.creado", "Mensaje de prueba");
    //     };
    // }


}
