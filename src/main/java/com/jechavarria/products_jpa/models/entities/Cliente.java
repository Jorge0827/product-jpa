package com.jechavarria.products_jpa.models.entities;


import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer clientId;

    @Column(name = "nombre_completo", nullable = false)
    private String fullName;

    @Column(name = "correo", unique = true, nullable = false)
    private String email;

    @Column(name = "numero_telefono")
    private String phoneNumber;

    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
}
