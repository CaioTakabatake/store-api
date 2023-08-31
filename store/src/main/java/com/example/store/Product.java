package com.example.store;

public class Product {
    private int id;
    private String name;
    private String description;
    private double unitaryPrice;

    public Product(int id, String name, String description, double unitaryPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitaryPrice = unitaryPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unitaryPrice=" + unitaryPrice +
                '}';
    }
}
