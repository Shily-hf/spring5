package edu.shily.spring5.service;

import edu.shily.spring5.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Shily-zhang
 * @Description
 */
//@Component(value = "userService")//等价于<bean id="userService" class="...">，如果不明示出value值，则默认值为类名，且首字母小写
@Service
public class UserService {

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired//根据类型进行注入
    @Qualifier(value = "userDaoImpl1")//根据名称注入,名称必须一致否则会报错NoSuchBeanDefinitionException
    private UserDao userDao;

//    @Resource根据类型注入               属于javax中的注解
//    @Resource(name="userDaoImpl1")根据名称注入
//private UserDao userDao;
    @Value(value = "abc")
    private String name;


    public void add(){
        System.out.println("edu.shily.spring5.dao.service add...." + name);
        userDao.add();
    }
}
