package com.jechavarria.products_jpa.models.entities;

import java.io.Serializable;//Permite que la clase implemente Serializable, 
                            //necesario para que JPA pueda manejar la clave compuesta.
import java.util.Objects;//Permite usar Objects.equals y Objects.hash en los métodos 
                        //equals() y hashCode(), que son necesarios para comparar 
                        //correctamente las claves compuestas.

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;


//Serializable le dice a Java que esa clase puede ser "empaquetada" y 
//"desempaquetada" para almacenamiento o transmisión.
@Embeddable
/*La anotación @Embeddable le dice a JPA que esta clase no es una entidad por sí sola, 
sino que será “embebida” (insertada) dentro de otra entidad. 
Así, JPA sabe que los campos de esta clase forman parte de la entidad principal (DetallePedido). */
@Data
public class DetallePedidoId implements Serializable {
    
    @Column(name = "id_pedido")
    private Integer orderId;

    @Column(name = "id_producto")
    private Integer productId;

    public DetallePedidoId(){

    }

    public DetallePedidoId(Integer orderId, Integer productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // ¿Es el mismo objeto en memoria?
        if (o == null || getClass() != o.getClass()) return false; // ¿Es nulo o de otra clase?
        DetallePedidoId that = (DetallePedidoId) o; // Lo convertimos al tipo correcto
        return Objects.equals(orderId, that.orderId) && Objects.equals(productId, that.productId); // Comparamos los campos
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
}
