package qianfg.fun.proxy.cglib;

/**
 * 优点：目标对象不需要实现接口
 * <p>
 * 缺点：代理的类不能为final，否则报错 java.lang.IllegalArgumentException
 * 如果目标对象的方法为final/static,不会被拦截，即不会执行目标对象额外的业务方法
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("cglib代理模式");
        TeacherDao target = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
