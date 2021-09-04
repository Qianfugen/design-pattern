package qianfg.fun.singleton.type6;

/**
 * 静态内部类
 * <p>
 * 优点：线程安全，利用静态内部类特点实现延迟加载，效率高
 * <p>
 * 结论：在实际开发中，推荐使用这种单例设计模式
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        System.out.println("使用静态内部类实现单例模式，线程安全~~");
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

    //静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才
    //会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
    private static class SingletonInstance {
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
