package spring.config.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.config.scan")
@PropertySource("classpath:myApp.properties")
public class Config {}
