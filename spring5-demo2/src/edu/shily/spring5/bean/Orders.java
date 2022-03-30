package edu.shily.spring5.bean;

/**
 * @author Shily-zhang
 * @Description bean的生命周期
 *
 * 1.通过构造器创建bean的实例（无参构造器）
 * 2.为bean的属性设置值和对其他bean引用（调用set方法）
 * 3.调用bean的初始化的方法（需要进行配置初始化方法）
 * 4.bean可以使用（获取到bean对象）
 * 5.当容器关闭的时候，调用bean的销毁方法（需要进行配置销毁方法）
 */
public class Orders {

    private String oname;

    public Orders() {
        System.out.println("第一步，执行无参数构造创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，调用set方法设置属性值");
    }

    public void initMethod(){
        System.out.println("第三步，执行初始化的方法");
    }

    public void destoryMethod(){
        System.out.println("第五步，执行销毁方法");
    }
}
