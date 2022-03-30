package edu.shily.spring5.bean;

/**
 * @author Shily-zhang
 * @Description
 */
public class Empl {

    //员工类
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setEname(String ename)  {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    //需要生成dept的get的方法
    public Dept getDept() {
        return dept;
    }

    public void add(){
        System.out.println(ename + "::" + gender + "::" + dept);
    }
}
