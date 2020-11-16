package spring.config.xmljava;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.xmljava.domain.Person;

public class ApplicationXmlPlusJava {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextSmall.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.say();

        context.close();
    }
}
