package edu.shily.spring5.testdemo;

import edu.shily.spring5.autowire.Dept;
import edu.shily.spring5.autowire.Emp;
import edu.shily.spring5.bean.Orders;
import edu.shily.spring5.collectiontype.Book;
import edu.shily.spring5.collectiontype.Course;
import edu.shily.spring5.collectiontype.Stu;
import edu.shily.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Shily-zhang
 * @Description
 */
public class TestDemo {

    @Test
    public void testDemo1(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置文件创建的对象
        Stu stu = context.getBean("stu", Stu.class);

        stu.test();
    }

    @Test
    public void testDemo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book1 = context.getBean("book", Book.class);

        Book book2 = context.getBean("book", Book.class);

        System.out.println(book1);
        System.out.println(book2);
//        book1.edu.shily.spring5.dao.test();
    }

    @Test
    public void testDemo3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Course course = context.getBean("myBean", Course.class);

        System.out.println(course);
    }

    @Test
    public void testDemo4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Orders order = context.getBean("order", Orders.class);

        System.out.println("第四步，获取创建的对象");
        System.out.println(order);

        context.close();
    }

    @Test
    public void tetstDemo5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }
}
