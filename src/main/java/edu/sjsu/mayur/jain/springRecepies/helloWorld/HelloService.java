package edu.sjsu.mayur.jain.springRecepies.helloWorld;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }
}
