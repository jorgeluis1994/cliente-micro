package com.dev.bank.service.services;

import com.dev.bank.service.models.Persona;
import com.dev.bank.service.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> listarPersonas() {
        return personaRepository.findAll();
    }

    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public Persona obtenerPersona(Long id) {
        return personaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Persona no encontrada"));
    }

    public Persona actualizarPersona(Long id, Persona persona) {
        Persona existente = obtenerPersona(id);
        existente.setNombre(persona.getNombre());
        existente.setGenero(persona.getGenero());
        existente.setEdad(persona.getEdad());
        existente.setIdentificacion(persona.getIdentificacion());
        existente.setDireccion(persona.getDireccion());
        existente.setTelefono(persona.getTelefono());
        return personaRepository.save(existente);
    }

    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }
}