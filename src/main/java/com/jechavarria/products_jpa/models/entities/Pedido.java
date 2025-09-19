package com.jechavarria.products_jpa.models.entities;

import jakarta.persistence.*; //Todas las anotaciones
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "pedidos")
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer orderId;

    @Column(name = "fecha_pedido", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "monto", precision = 10, scale = 2)
    private Double amount;

    @Column(name = "estado", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente client;
}
