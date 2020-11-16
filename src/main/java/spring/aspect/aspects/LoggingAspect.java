package spring.aspect.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    //@Before("voidPointcut()")
    public void startLogging() {
        System.out.println("start logging...");
    }

    //@After("voidPointcut()")
    public void stopLogging(long nanos) {
        System.out.println("stop logging... " + nanos);
    }

    @Around("voidPointcut()")
    public Object aroundLogging(ProceedingJoinPoint point) throws Throwable {
        this.startLogging();
        long start = System.currentTimeMillis();
        Object returnValue = point.proceed();
        long end = System.currentTimeMillis();
        this.stopLogging(end - start);
        return returnValue;
    }

    @Pointcut("spring.aspect.aspects.Pointcuts.voidPointcut()")
    public void voidPointcut() {}

}
