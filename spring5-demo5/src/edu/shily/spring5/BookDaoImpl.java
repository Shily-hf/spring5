package edu.shily.spring5;

import edu.shily.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shily-zhang
 * @Description DAO（data access object） 方法实现类，实现具体方法的功能
 */

@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        //创建sql语句
        String sql = "insert into t_book values(?,?,?)";

        //调用方法
        Object[] args = {book.getBook_id(), book.getBook_name(), book.getBook_status()};
        int update = jdbcTemplate.update(sql, args);

//        int update = jdbcTemplate.update(sql, book.getBookId(), book.getBookname(), book.getBookstatus());

        System.out.println(update);
    }

    //修改方法
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set book_name=?,book_status=? where book_id=?";

        Object[] args = {book.getBook_name(), book.getBook_status(),book.getBook_id() };
        int update = jdbcTemplate.update(sql, args);

        System.out.println(update);
    }

    //删除方法
    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where book_id=?";

        int update = jdbcTemplate.update(sql, id);

        System.out.println(update);
    }


    //查询表记录条数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";

        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        return count;
    }

    //查询表中的数据
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where book_id=?";

        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class),id);

        return book;
    }

    //查询表所有数据
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book";

        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));

        return bookList;
    }

    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);

        System.out.println(Arrays.toString(ints));
    }

    //批量修改
    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set book_name=?,book_status=? where book_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }

    //批量删除
    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where book_id=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);

        System.out.println(Arrays.toString(ints));
    }

}
