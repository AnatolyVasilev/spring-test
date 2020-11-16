package spring.config.purejava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.config.purejava.domain.Dog;
import spring.config.purejava.domain.Person;
import spring.config.purejava.domain.Pet;

@Configuration
@PropertySource("classpath:myApp.properties")
public class Config {

    @Bean
    public Pet myPet() {
        return new Dog();
    }

    @Bean
    public Person myPerson() {
        Person person = new Person(myPet());
        return person;
    }

}
