package com.Metodos.Cuantivos.Service.impl;

import com.Metodos.Cuantivos.Entidades.Product;
import com.Metodos.Cuantivos.Repository.IProductRepository;
import com.Metodos.Cuantivos.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
@Service
public class ProductoServiceImpl implements ProductService {
    @Autowired
    IProductRepository productRepository;

    public List<Product> findAll() {
        Iterable<Product> iterable = productRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }
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
