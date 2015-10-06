package edu.sjsu.mayur.jain.springRecepies.constructorInjection;

/**
 * Created by mjain on 10/5/15.
 */
public abstract class Product {

    /**
     * no need for setters and getters
     * */

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
