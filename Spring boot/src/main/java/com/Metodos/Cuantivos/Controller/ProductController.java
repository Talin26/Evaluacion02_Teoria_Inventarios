package com.Metodos.Cuantivos.Controller;

import com.Metodos.Cuantivos.Entidades.Product;
import com.Metodos.Cuantivos.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/Crear")
    public ResponseEntity<?> Create(@RequestBody Product product){
        productService.save(product);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/Buscar/{CodigoProducto}")
    public Product buscar(@PathVariable Long CodigoProducto){
       return productService.findById(CodigoProducto).orElseThrow(null);
    }

    @PutMapping("/Sacar/{CodigoProducto}/{cantidad}")
    public ResponseEntity<?> Sacar(@PathVariable Long CodigoProducto,@PathVariable Integer cantidad) {
        Product product = productService.findById(CodigoProducto).orElseThrow(null);

        if (product == null) {
            return ResponseEntity.noContent().build();
        }

        if (product.getCantidad() < cantidad) {
            return ResponseEntity.badRequest().body("No hay esa cantidad ");
        } else {
            product.setCantidad(product.getCantidad() - cantidad);
            productService.save(product);
            return ResponseEntity.ok("Cantidad Sacada del inventario");
        }

    }
    @PutMapping("/Meter/{CodigoProducto}/{cantidad}")
    public ResponseEntity<?> Meter(@PathVariable Long CodigoProducto,@PathVariable Integer cantidad) {
        Product product = productService.findById(CodigoProducto).orElseThrow(null);

        if (product == null) {
            return ResponseEntity.noContent().build();
        }

        product.setCantidad(product.getCantidad()+cantidad);
        productService.save(product);
        return ResponseEntity.ok("Cantidad Metida del inventario");

}
@GetMapping("/productos")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }
    }
