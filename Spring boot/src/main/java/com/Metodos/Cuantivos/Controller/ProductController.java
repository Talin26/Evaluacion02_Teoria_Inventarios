package com.Metodos.Cuantivos.Controller;

import com.Metodos.Cuantivos.Entidades.Product;
import com.Metodos.Cuantivos.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/Buscar/{id}")
    public Product buscar(@PathVariable Long CodigoProducto){
       return productService.findById(CodigoProducto).orElseThrow(null);
    }

    @PutMapping("/Sacar/{id}/{cantidad}")
    public ResponseEntity<?> Sacar(@PathVariable Long codigo,@PathVariable Integer Cantidad) {
        Product product = productService.findById(codigo).orElseThrow(null);

        if (product == null) {
            return ResponseEntity.noContent().build();
        }
        Boolean cierto = product.getTotal() > Cantidad;
        if (cierto = false) {
            return ResponseEntity.badRequest().body("No hay esa cantidad ");
        }
        product.setCantidad(product.getCantidad() - Cantidad);
        productService.save(product);
        return ResponseEntity.ok("Cantidad Sacada del inventario");

    }
    @PutMapping("/Meter/{id}/{cantidad}")
    public ResponseEntity<?> Meter(@PathVariable Long codigo,@PathVariable Integer Cantidad) {
        Product product = productService.findById(codigo).orElseThrow(null);

        if (product == null) {
            return ResponseEntity.noContent().build();
        }

        product.setCantidad(product.getCantidad()+Cantidad);
        productService.save(product);
        return ResponseEntity.ok("Cantidad Metida del inventario");

}
    }
