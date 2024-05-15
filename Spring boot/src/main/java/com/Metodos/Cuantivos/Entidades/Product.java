package com.Metodos.Cuantivos.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Product")
public class Product {
    @Id
    @Column(unique=true)
    private Long codigoProducto;
    private Integer cantidad;
    private String productDescription;
    private Double UniPrice;
    private Double total;
}
