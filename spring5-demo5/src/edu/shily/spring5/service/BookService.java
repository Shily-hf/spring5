package edu.shily.spring5.service;

import edu.shily.spring5.BookDao;
import edu.shily.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Shily-zhang
 * @Description 服务层，对操作的封装
 */

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改方法
    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    //删除方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    //查询表记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    //查询表数据
    public Book findOne(String id){
        return  bookDao.findBookInfo(id);
    }

    //查询放回数据集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    //批量添加数据
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }

    //批量删除
    public void bathcDelete(List<Object[]> batchArgs){
        bookDao.batchDeleteBook(batchArgs);
    }
}
