package com.example.store;

import java.util.ArrayList;
import java.util.List;

public class TableProducts {
    List<Product> products = new ArrayList<>();

    public TableProducts() {
        Product pen = new Product(1, "Bic", "Blue bic", 1.99);
        Product eraser = new Product(2, "Eraser", "White eraser", 3.99);
        Product pencil = new Product(3, "Pencil", "Faber Castel pencil", 2.99);
        Product sharpener = new Product(4, "Sharpener", "Standard sharpener", 7.99);
        Product notebook = new Product(5, "Notebook", "Blank notebook", 15.99);

        this.products.add(pen);
        this.products.add(eraser);
        this.products.add(pencil);
        this.products.add(sharpener);
        this.products.add(notebook);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Product> getAllProducts() {
        return this.getProducts();
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product addProduct(Product product) {
        int newId = products.size() + 1;
        product.setId(newId);
        products.add(product);
        return product;
    }

    public Product updateProduct(int id, Product updatedProduct) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(updatedProduct.getName());
                product.setDescription(updatedProduct.getDescription());
                product.setUnitaryPrice(updatedProduct.getUnitaryPrice());
                return product;
            }
        }
        return null;
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
