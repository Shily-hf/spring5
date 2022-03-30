package edu.shily.spring5.collectiontype;

import java.util.List;

/**
 * @author Shily-zhang
 * @Description
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
