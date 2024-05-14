package com.Metodos.Cuantivos.Service;

import com.Metodos.Cuantivos.Entidades.Product;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    void save(Product product);
    void deleteById(long id);
}
