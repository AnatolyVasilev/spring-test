package spring.config.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.config.xml.domain.Person;

public class ApplicationXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextFull.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.say();

        context.close();
    }
}
