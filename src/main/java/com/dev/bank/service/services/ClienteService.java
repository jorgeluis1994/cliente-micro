package com.dev.bank.service.services;

import com.dev.bank.service.models.Cliente;
import com.dev.bank.service.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Listar todos los clientes
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    // Guardar un nuevo cliente
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Buscar cliente por ID
    public Cliente obtenerCliente(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    // Actualizar cliente
    public Cliente actualizarCliente(Long id, Cliente cliente) {
        Cliente existente = obtenerCliente(id);
        existente.setNombre(cliente.getNombre());
        existente.setGenero(cliente.getGenero());
        existente.setEdad(cliente.getEdad());
        existente.setIdentificacion(cliente.getIdentificacion());
        existente.setDireccion(cliente.getDireccion());
        existente.setTelefono(cliente.getTelefono());
        existente.setClienteId(cliente.getClienteId());
        existente.setContrasena(cliente.getContrasena());
        existente.setEstado(cliente.getEstado());
        return clienteRepository.save(existente);
    }

    // Eliminar cliente
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}   