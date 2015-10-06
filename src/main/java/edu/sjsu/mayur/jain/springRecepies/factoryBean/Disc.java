package edu.sjsu.mayur.jain.springRecepies.factoryBean;

/**
 * Created by mjain on 10/5/15.
 */
public class Disc extends Product {

    private int capacity;

    public Disc() {
        super();
    }

    public Disc(String name, double price) {
        super(name, price);
    }
}
