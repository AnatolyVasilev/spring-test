package spring.config.scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.scan.domain.Person;

public class ApplicationJavaScan {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("myPerson", Person.class);
        person.say();

        context.close();
    }
}
