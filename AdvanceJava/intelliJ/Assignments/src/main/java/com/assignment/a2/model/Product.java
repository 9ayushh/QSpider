package com.assignment.a2.model;

public class Product {
    private int prodId;
    private String name;
    private double price;
    private ShoppingCart quantity;

    public double total(double price, int quantity) {
        return price * quantity;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ShoppingCart getQuantity() {
        return quantity;
    }

    public void setQuantity(ShoppingCart quantity) {
        this.quantity = quantity;
    }
}
