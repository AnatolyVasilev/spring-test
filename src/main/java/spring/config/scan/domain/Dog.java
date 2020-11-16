package spring.config.scan.domain;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Pet {
    public void say() {
        System.out.println("Bow-Wou");
    }
}
