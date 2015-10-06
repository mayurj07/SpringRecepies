package edu.sjsu.mayur.jain.springRecepies.setterInjection;

/**
 * Created by mjain on 10/5/15.
 */
public class Disc extends Product {

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;

    public Disc() {
        super();
    }

    public Disc(String name, double price) {
        super(name, price);
    }
}
