package spring.config.xmljava.domain;

import org.springframework.stereotype.Component;

@Component("myCat")
public class Cat implements Pet {
    public void say() {
        System.out.println("Myau-Myau");
    }
}
