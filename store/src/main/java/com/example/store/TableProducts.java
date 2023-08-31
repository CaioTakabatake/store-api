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
    }
}
