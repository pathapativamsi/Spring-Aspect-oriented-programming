package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {
    @Pointcut("within(demo..*)")
    public void AuthenticationPointCut(){

    }

    @Pointcut("within(demo.ShoppingCart.*)")
    public void AuthorisationPointCut(){

    }

    @Before("AuthenticationPointCut() && AuthenticationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating");
    }
}
