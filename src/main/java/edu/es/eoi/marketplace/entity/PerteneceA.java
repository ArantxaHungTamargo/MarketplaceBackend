package edu.es.eoi.marketplace.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class PerteneceA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "articulo_id")
    private Articulo articulo;

    private int cantidad;
}
