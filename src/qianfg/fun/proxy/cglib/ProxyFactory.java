package qianfg.fun.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂
 */
public class ProxyFactory implements MethodInterceptor {

    //被代理对象
    private TeacherDao target;

    public ProxyFactory(TeacherDao target) {
        this.target = target;
    }

    /**
     * 返回代理对象
     * 被代理类不能为final，否则无法继承
     */
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截被代理对象方法，方法增强
     * 无法拦截final/static修饰的方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");
        Object result = method.invoke(target, args);
        System.out.println("代理结束");
        return result;
    }
}
