package com.dev.bank.service.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MovimientoListener {

    // @RabbitListener(queues = "movimientosQueue")
    // public void procesarMovimiento(MovimientoDTO movimiento) {
    //     System.out.println(">>> Cliente recibió movimiento: " + movimiento);
        
    // }

    
}
