package com.example.store;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/store/products")
public class ProductController {
    private TableProducts tableProducts;

    public ProductController() {
        this.tableProducts = new TableProducts();
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return tableProducts.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return tableProducts.getProductById(id);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return tableProducts.addProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        return tableProducts.updateProduct(id, updatedProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        tableProducts.deleteProduct(id);
    }
}
