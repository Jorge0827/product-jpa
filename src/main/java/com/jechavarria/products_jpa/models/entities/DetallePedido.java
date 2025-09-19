package com.jechavarria.products_jpa.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalle_pedido")
@Data
public class DetallePedido {
    @EmbeddedId
    private DetallePedidoId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "id_pedido")
    private Pedido order;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "id_producto")
    private Producto product;

    @Column(name = "cantidad", nullable = false)
    private Integer quantity;

    @Column(name = "precio_unitario", precision = 10, scale = 2)
    private Double unitPrice;
}
