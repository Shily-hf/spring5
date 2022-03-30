package edu.shily.spring5.bean;

/**
 * @author Shily-zhang
 * @Description 部门和员工一对多的关系
 */
public class Dept {
    //部门类
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
