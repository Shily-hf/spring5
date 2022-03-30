package edu.shily.spring5.entity;

/**
 * @author Shily-zhang
 * @Description 实体类，用于完善实体具有的属性
 */
public class Book {

    private String book_id;
    private String book_name;
    private String book_status;

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id='" + book_id + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_status='" + book_status + '\'' +
                '}';
    }
}
