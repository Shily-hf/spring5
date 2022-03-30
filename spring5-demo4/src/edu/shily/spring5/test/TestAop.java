package edu.shily.spring5.test;

import edu.shily.spring5.aopanno.User;
import edu.shily.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class TestAop {

    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);

        user.add();
    }

    @Test
    public void testAopXml(){

        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //获取配置文件创建的对象
        Book book = context.getBean("book", Book.class);

        book.buy();
    }
}
