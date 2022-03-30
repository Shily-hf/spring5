package edu.shily.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Shily-zhang
 * @Description
 */

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* edu.shily.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("Peson Before......");
    }
}
