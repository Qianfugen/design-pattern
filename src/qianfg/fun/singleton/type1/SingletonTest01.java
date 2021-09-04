package qianfg.fun.singleton.type1;

/**
 * 饿汉式（静态常量）
 *
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
 *
 * 缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则
 * 会造成内存的浪费
 *
 * 结论：这种单例模式可用，但是可能造成内存浪费
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashcode=" + instance.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }
}

class Singleton {

    //1.构造器私有化，防止外部new
    private Singleton() {
    }

    //2.类的内部创建静态实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公有静态方法，返回对象实例
    public static Singleton getInstance() {
        return instance;
    }

}
