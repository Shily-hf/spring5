package edu.shily.spring5;

import org.springframework.stereotype.Repository;

/**
 * @author Shily-zhang
 * @Description
 */
@Repository("userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("edu.shily.spring5.dao add....");
    }
}
