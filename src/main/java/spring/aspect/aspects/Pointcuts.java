package spring.aspect.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(public void addBook(..))")
    public void voidPointcut() {}

}
