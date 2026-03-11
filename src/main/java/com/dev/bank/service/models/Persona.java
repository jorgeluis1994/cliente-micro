package com.dev.bank.service.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "personas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) 
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    private String nombre;
    private String genero;
    private Integer edad;
    private String identificacion;
    private String direccion;
    private String telefono;
}