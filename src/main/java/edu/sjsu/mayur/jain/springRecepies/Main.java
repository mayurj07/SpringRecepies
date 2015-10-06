package edu.sjsu.mayur.jain.springRecepies;

import edu.sjsu.mayur.jain.springRecepies.factoryBean.Battery;
import edu.sjsu.mayur.jain.springRecepies.factoryBean.Disc;
import edu.sjsu.mayur.jain.springRecepies.setterInjection.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("helloApp.xml");
        //HelloService helloService = context.getBean(HelloService.class);
        //System.out.println(helloService.sayHello());

        /*--------------------------------------------------------------------------------------------------------------*/
        ApplicationContext context = new ClassPathXmlApplicationContext("setterInjBean.xml");
        Product battery = (Product) context.getBean("battery");
        Product disc = (Product) context.getBean("disc");

        System.out.println("\nCreating Beans by invoking a Setters & Getters");
        System.out.println(battery);
        System.out.println(disc);
        System.out.println("\n");

        /**
         * The preceding bean configuration is equivalent to the following code snippet:
         *
            Product aaa = new Battery();
            aaa.setName("AAA");
            aaa.setPrice(2.5);
            aaa.setRechargeable(true);

            Product cdrw = new Disc();
            cdrw.setName("CD-RW");
            cdrw.setPrice(1.5);
            cdrw.setCapacity(700);
         */

        /*--------------------------------------------------------------------------------------------------------------*/

        ApplicationContext context1 = new ClassPathXmlApplicationContext("constructorInjcBean.xml");
        Product battery1 = (Product) context1.getBean("battery");
        Product disc1 = (Product) context1.getBean("disc");

        System.out.println("\nCreating Beans by invoking a Constructor");
        System.out.println(battery1);
        System.out.println(disc1);
        System.out.println("\n");

        /**
         * As there is no constructor ambiguity for the Product class and subclasses, the preceding bean
            configuration is equivalent to the following code snippet:

            Product aaa = new Battery("AAA", 2.5);
            aaa.setRechargeable(true);

            Product cdrw = new Disc("CD-RW", 1.5);
            cdrw.setCapacity(700);
         */

        /*--------------------------------------------------------------------------------------------------------------*/


        /*--------------------------------------------------------------------------------------------------------------*/

        ApplicationContext factoryBean = new ClassPathXmlApplicationContext("factoryBean.xml");
        Battery batteryF = (Battery) factoryBean.getBean("battery");
        Disc discF = (Disc) factoryBean.getBean("disc");

        System.out.println("\nCreating Beans by invoking a Factory Bean instance");
        System.out.println(batteryF);
        System.out.println(discF);
        System.out.println("\n");

        /**
         * As there is no constructor ambiguity for the Product class and subclasses, the preceding bean
         configuration is equivalent to the following code snippet:

         DiscountFactoryBean aaa = new DiscountFactoryBean();
         aaa.setProduct(new Battery("AAA", 2.5));
         aaa.setDiscount(0.2);
         Product aaa = (Product) aaa.createInstance();

         DiscountFactoryBean cdrw = new DiscountFactoryBean();
         cdrw.setProduct(new Disc("CD-RW", 1.5));
         cdrw.setDiscount(0.1);
         Product cdrw = (Product) cdrw.createInstance();
         */

        /*--------------------------------------------------------------------------------------------------------------*/


    }
}
