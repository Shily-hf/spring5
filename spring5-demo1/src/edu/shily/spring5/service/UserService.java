package edu.shily.spring5.service;

import edu.shily.spring5.UserDao;

/**
 * @author Shily-zhang
 * @Description
 */
public class UserService {

    //创建UserDao类型属性，生成对应的set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("edu.shily.spring5.dao.service add........");
        //创建UserDao对象  原始的写法，耦合度较高
//        UserDaoImpl userDao = new UserDaoImpl();
//        userDao.update();

        userDao.update();
    }
}
