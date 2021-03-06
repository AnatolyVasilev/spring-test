package spring.aspect.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("voidPointcut()")
    public void startLogging() {
        System.out.println("checking auth...");
    }

    @Pointcut("spring.aspect.aspects.Pointcuts.voidPointcut()")
    public void voidPointcut() {}

}
