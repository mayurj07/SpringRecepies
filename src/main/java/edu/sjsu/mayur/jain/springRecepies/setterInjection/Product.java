package edu.sjsu.mayur.jain.springRecepies.setterInjection;

/**
 * Created by mjain on 10/5/15.
 */
public abstract class Product {

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

    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " " + price;
    }

}
