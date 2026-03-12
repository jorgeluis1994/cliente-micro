package com.dev.bank.service.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public TopicExchange movimientosExchange() {
        return new TopicExchange("movimientosExchange");
    }

    @Bean
    public Queue movimientosQueue() {
        return new Queue("movimientosQueue", true); 
    }

    @Bean
    public Binding binding(Queue movimientosQueue, TopicExchange movimientosExchange) {
        return BindingBuilder.bind(movimientosQueue)
                             .to(movimientosExchange)
                             .with("movimiento.creado");
    }
}