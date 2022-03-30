package edu.shily.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author Shily-zhang
 * @Description
 */

//被增强的类
@Component
public class User {
    public void add(){
        System.out.println("add....");
    }
}
