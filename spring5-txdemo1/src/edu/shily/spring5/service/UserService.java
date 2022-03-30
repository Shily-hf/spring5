package edu.shily.spring5.service;

import edu.shily.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Shily-zhang
 * @Description
 */

@Service        //设置只读操作；设置超时，超时未提交则回滚；设置传播行为；设置隔离级别
//@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
public class UserService {

    //注入Dao
    @Autowired
    private UserDao userDao;

    //转账方法
    public void accountMoney(){
//        编程式事务管理
//        try {
//            //第一步 开启事务
//
//            //第二步 进行业务操作
//            //lucy少100
            userDao.reduceMoney();
//
            //模拟异常
            int i  = 10 / 0;
//            //mary多100
            userDao.addMoney();
//
//            //第三步 没有发生异常，提交事务
//        } catch (Exception e) {
//            //第四步 发生异常，事务回滚
//            e.printStackTrace();
//        }


    }
}
