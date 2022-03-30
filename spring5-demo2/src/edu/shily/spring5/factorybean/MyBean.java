package edu.shily.spring5.factorybean;

import edu.shily.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Shily-zhang
 * @Description
 */
public class MyBean implements FactoryBean<Course>{
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
