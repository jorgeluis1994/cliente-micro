package com.dev.bank.service.exceptions;

public class ClienteNotFoundException extends RuntimeException {
    public ClienteNotFoundException(Long id) {
        super("Cliente con id " + id + " no encontrado");
    }
}