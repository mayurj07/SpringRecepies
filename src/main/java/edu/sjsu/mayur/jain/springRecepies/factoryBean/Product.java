package edu.sjsu.mayur.jain.springRecepies.factoryBean;

/**
 * Created by mjain on 10/5/15.
 */
public abstract class Product {

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " " + price;
    }

}
