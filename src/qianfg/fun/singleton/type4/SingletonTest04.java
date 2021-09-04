package qianfg.fun.singleton.type4;

/**
 * 懒汉式（线程安全，同步方法）
 * <p>
 * 优点：起到了 Lazy Loading 的效果，解决了线程安全问题
 * <p>
 * 缺点：效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行
 * 一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 * <p>
 * 结论：在实际开发中，不推荐使用这种方式
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全~~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashcode=" + instance.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }
}

class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    // 提供一个公有静态方法，方法加上同步锁，解决线程安全问题
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
