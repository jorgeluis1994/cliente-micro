package com.dev.bank.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.bank.service.models.Persona;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
