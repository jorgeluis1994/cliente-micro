package com.dev.bank.service.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.dev.bank.service.models.Cliente;
import com.dev.bank.service.services.ClienteService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(ClienteController.class)
public class ClienteControllerTest {

        @Autowired
    private MockMvc mockMvc; 

    @MockBean
    private ClienteService clienteService; 

    @Autowired
    private ObjectMapper objectMapper; 

        @Test
    void crearCliente_DebeRetornarClienteGuardado() throws Exception {
   
        Cliente clienteACrear = new Cliente();
        clienteACrear.setNombre("Carlos Gomez");
       

        Cliente clienteGuardado = new Cliente();
        clienteGuardado.setId(1L); 
        clienteGuardado.setNombre("Carlos Gomez");

       
        org.mockito.Mockito.when(clienteService.guardarCliente(org.mockito.ArgumentMatchers.any(Cliente.class)))
                .thenReturn(clienteGuardado);

        mockMvc.perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/clientes")
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(clienteACrear)))
                .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.status().isOk())
                .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("$.id").value(1))
                .andExpect(org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath("$.nombre").value("Carlos Gomez"));
    }


    
}
