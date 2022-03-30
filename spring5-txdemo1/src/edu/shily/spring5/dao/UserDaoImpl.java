package edu.shily.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Shily-zhang
 * @Description
 */
@Repository
public class UserDaoImpl implements UserDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //lucy转帐100元给mary

    //多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";

        jdbcTemplate.update(sql,100,"mary");
    }


    //少钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money=money-? where username=?";

        jdbcTemplate.update(sql,100,"lucy");
    }
}
