package qianfg.fun.singleton.type5;

/**
 * 双重检查
 * <p>
 * 优点：延迟加载；效率较高
 * <p>
 * 缺点：代码比较复杂
 * <p>
 * 结论：在实际开发中，推荐使用这种单例设计模式
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("双重检查，线程安全~~");
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

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
