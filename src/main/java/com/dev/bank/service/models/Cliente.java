
package com.dev.bank.service.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true) 
public class Cliente extends Persona {

    @Column(unique = true, nullable = false)
    private String clienteId;

    @Column(nullable = false)
    private String contrasena;

    private Boolean estado;
}
