package qianfg.fun.proxy.staticproxy;

/**
 * 优点：在不修改目标对象功能的前提下，通过代理对象对目标功能扩展
 * <p>
 * 缺点：因为代理对象需要与目标对象实现一样的接口，所有会有很多代理类
 * 一旦接口增加方法，目标对象与代理对象都要维护
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("静态代理模式");
        //创建目标对象（被代理对象）
        TeacherDao target = new TeacherDao();
        //创建代理对象，同时将被代理对象传递给代理对象
        TeacherDaoProxy proxy = new TeacherDaoProxy(target);
        //通过代理对象，调用被代理对象的方法
        proxy.teach();
    }
}
