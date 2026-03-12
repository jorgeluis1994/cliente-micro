    package com.dev.bank.service.repository;

    import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    import com.dev.bank.service.models.Cliente;
    @Repository
    public interface ClienteRepository extends JpaRepository<Cliente, Long> {

        List<Cliente> findByNombreContainingIgnoreCase(String nombre);

    }
