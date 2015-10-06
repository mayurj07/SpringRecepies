package edu.sjsu.mayur.jain.springRecepies.setterInjection;

/**
 * Created by mjain on 10/5/15.
 */


public class Battery extends Product {

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }

    private boolean rechargeable;

    public Battery() {
        super();
    }

    public Battery(String name, double price) {
        super(name, price);
    }
}
