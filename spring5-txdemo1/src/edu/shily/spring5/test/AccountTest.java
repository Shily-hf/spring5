package edu.shily.spring5.test;

import edu.shily.spring5.config.TxConfig;
import edu.shily.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class AccountTest {

    @Test//基于注解进行事务管理
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }

    @Test  //基于xml文件配置进行事务管理
    public void testAccount1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }

    //完全注解开发，有问题，事务管理未发生
    @Test
    public void testAccount2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }

    //Spring5核心框架支持函数式创建对象，交给spring进行管理
    @Test
    public void testAccount3(){
        //创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();

        //调用context的方法进行对象注册
        context.refresh();
        context.registerBean("user1",User.class,() -> new User());
//        context.registerBean(User.class,() -> new User());
//        context.getBean("edu.shily.spring5.test");
        //获取在spring注册的对象
        User user1 = (User) context.getBean("user1");

        System.out.println(user1);

    }
}
