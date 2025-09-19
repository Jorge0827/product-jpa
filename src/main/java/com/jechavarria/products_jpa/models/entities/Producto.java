package com.jechavarria.products_jpa.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer productId;

    @Column(name = "nombre", nullable = false)
    private String name;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private Double unitPrice;

    @Column(name = "cantidad")
    private Integer quantity;
}
