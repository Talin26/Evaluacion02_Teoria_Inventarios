package com.Metodos.Cuantivos.Service;

import com.Metodos.Cuantivos.Entidades.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);

    void deleteById(long id);
}
