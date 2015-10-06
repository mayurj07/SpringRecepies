package edu.sjsu.mayur.jain.springRecepies.constructorInjection;

/**
 * Created by mjain on 10/5/15.
 */


public class Battery extends Product {

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }
}
