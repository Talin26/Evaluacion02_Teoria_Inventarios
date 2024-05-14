package com.Metodos.Cuantivos.Repository;

import com.Metodos.Cuantivos.Entidades.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends CrudRepository<Product,Long> {
}
