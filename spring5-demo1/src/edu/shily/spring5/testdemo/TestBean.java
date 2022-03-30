package edu.shily.spring5.testdemo;

import edu.shily.spring5.bean.Empl;
import edu.shily.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class TestBean {

    @Test
    public void testBean(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void test(){
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置创建的对象
        Empl empl = context.getBean("empl", Empl.class);

        empl.add();


    }
}
