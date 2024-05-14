package com.Metodos.Cuantivos.Service.impl;

import com.Metodos.Cuantivos.Entidades.Product;
import com.Metodos.Cuantivos.Repository.IProductRepository;
import com.Metodos.Cuantivos.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;
@Service
public class ProductoServiceImpl implements ProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(long id) {
        productRepository.deleteById(id);

    }
}
