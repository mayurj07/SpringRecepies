package edu.sjsu.mayur.jain.springRecepies.factoryBean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * Created by mjain on 10/6/15.
 */
public class DiscountFactoryBean extends AbstractFactoryBean {

    private Product product;
    private double discount;


    public void setProduct(Product product) {
        this.product = product;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Class getObjectType(){
        return  product.getClass();
    }

    protected Object createInstance() throws Exception {
        product.setPrice(product.getPrice() * (1 - discount));
        return product;
    }
}
