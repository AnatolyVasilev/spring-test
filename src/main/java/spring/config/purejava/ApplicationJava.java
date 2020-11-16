package spring.config.purejava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.purejava.domain.Person;

public class ApplicationJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("myPerson", Person.class);
        person.say();

        context.close();
    }
}
