package edu.shily.spring5.test;

import edu.shily.spring5.entity.Book;
import edu.shily.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shily-zhang
 * @Description 测试类，用于测试方法
 */
public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

//        添加操作
//        Book book = new Book();
//        book.setBookid("2");
//        book.setBookname("php");
//        book.setBookstatus("b");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setBookid("2");
//        book.setBookname("javaupup");
//        book.setBookstatus("shily");
//
//        bookService.updateBook(book);

        //删除
        //bookService.deleteBook("1");

        //查询返回某个值
//        int count = bookService.findCount();
//
//        System.out.println(count);

//        Book book = bookService.findOne("2");
//        System.out.println(book);

        //查询表所有数据
//        List<Book> books = bookService.findAll();
//        System.out.println(books);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//
//        Object[] o1 = {"3","php","a"};
//        Object[] o2 = {"4","python","b"};
//        Object[] o3 = {"5","web","c"};
//
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//
//        Object[] o1 = {"php1","a1","1"};
//        Object[] o2 = {"python2","b2","2"};
//        Object[] o3 = {"web3","c3","3"};
//
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//
//        //调用批量修改
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();

        Object[] o1 = {"3"};
        Object[] o2 = {"4"};

        batchArgs.add(o1);
        batchArgs.add(o2);

        //调用批量删除
        bookService.bathcDelete(batchArgs);
    }
}
