### IOC

Inversion of Control - передача обязаностей по созданию и управлению объектами Spring-у

### DI

Dependency Injection - передача управления зависимостями Spring-у. 

1. Через конструктор
2. Через сеттер
3. Напрямую в поле

### old XML configuration

1. Создаем конфигурационный файл контекста `<resources>/config.xml`
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xmlns:context="http://www.springframework.org/schema/context"
           xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">
    
    </beans>
    ```
2. Добавляем бины и путь до ресурсов
    ```xml
    ...
    <context:property-placeholder location="classpath:myApp.properties" />
    
    <bean id="myPet" class="yourpackage.YourClass" scope="prototype" init-method="myMethod" destroy-method="myDestroy"> <!-- scope singleton (by default) or prototype -->
        <constructor-arg ref="myPet" /> <!-- for constructor arg -->
        <property name="pet" ref="myPet" /> <!-- for setter -->
        <property name="surname" value="myValue" /> <!-- for value -->
        <property name="surname" value="${person.surname}" /> <!-- for value from property file -->
    </bean>
    ...
    ```
3. Создаем контекст
    ```java
    import org.springframework.context.support.ClassPathXmlApplicationContext;public class Test {
    
        public static void main(String[] args){
          ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
          // your code here        
          context.close();    
        }    
    
    }
    ```

### modern XML configuration

1. Создаем конфигурационный файл контекста `<resources>/config.xml`
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xmlns:context="http://www.springframework.org/schema/context"
           xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">
      <context:component-scan base-package="yourPackage" /> <!-- место, где искать компоненты -->
    </beans>
    ```
2. Добавляем аннотации для компонентов и DI
    ```java
    @Component
    @Scope("prototype") // scope
    public class MyComponent {
        @Autowired // делает DI в поле
        private Cat cat;
        @Value("34")    // static value
        private int age;  
        @Value("${profile.surname}")  // value from props file
        private String surname;
    
        @Autowired // делает DI в сетКэт
        @Qualifier("myCat")  // если бины конфликтуют
        public void setCat() {
        
        }
    
        @PostConstruct // init method
        private void init() {}
    
        @PreDestroy // destroy method
        private void destroy(){}
    
    }
```
3. Создаем контекст
    ```java
    import org.springframework.context.support.ClassPathXmlApplicationContext;public class Test {
    
        public static void main(String[] args){
          ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
          // your code here        
          context.close();    
        }    
    
    }
    ```

### java configuration 1

### java configuration 2