package service;

import entities.Product;

public class OrderItem {
    private Integer qtd;
    private Double price;
    private Product product;

    public OrderItem(Integer qtd, Double price, Product product) {
        this.qtd = qtd;
        this.price = price;
        this.product = product;
    }

    public OrderItem() {
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        return qtd * price;
    }

    @Override
    public String toString() {
        return getProduct().getName() + ", " + getProduct().getPrice() + ", Quantity: " +  + getQtd() + ", Subtotal: $" + subTotal();

    }
}
