package qianfg.fun.proxy.dynamic;

/**
 * 1.代理对象不需要实现接口，但是目标对象需要实现接口，否则不能使用动态代理
 * 2.代理对象的生成，使用的是JDK的API,基于反射，动态地在内存中创建对象
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("动态代理模式");
        TeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        proxyInstance.teach();
    }
}
