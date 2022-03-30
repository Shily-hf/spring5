package edu.shily.spring5.test;

import edu.shily.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Shily-zhang
 * @Description
 */
//@ExtendWith(SpringExtension.class)//注解引用
//@ContextConfiguration("classpath:bean1.xml")

    //简化注解
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test2(){
        userService.accountMoney();
    }
}
