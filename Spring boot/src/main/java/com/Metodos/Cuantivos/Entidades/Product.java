package com.Metodos.Cuantivos.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @Column(unique=true)
    private Long CodigoProducto;
    private Integer Cantidad;
    private String productDescription;
    private Double UniPrice;
    private Double Total;
}
