package edu.shily.spring5;

import edu.shily.spring5.entity.Book;

import java.util.List;

//定义一些需要的方法
public interface BookDao {
    //添加的方法
    void add(Book book);

    //修改方法
    void updateBook(Book book);

    //删除方法
    void deleteBook(String id);

    //查询表记录数
    int selectCount();

    //查询表数据
    Book findBookInfo(String id);

    //查询表所有数据
    List<Book> findAllBook();

    //批量添加
    void batchAddBook(List<Object[]> batchArgs);

    //批量修改
    void batchUpdateBook(List<Object[]> batchArgs);

    //批量删除
    void batchDeleteBook(List<Object[]> batchArgs);

}
