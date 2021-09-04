package qianfg.fun.singleton.type7;

/**
 * 枚举
 * <p>
 * 优点：代码简单，借助 JDK1.5 中添加的枚举来实现单例模式。
 * 不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * <p>
 * 结论：在实际开发中，强烈推荐
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用枚举实现单例模式~~");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashcode=" + instance.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());

        instance.sayOK();
    }
}

enum Singleton {
    INSTANCE;   //属性

    public void sayOK() {
        System.out.println("OK!");
    }
}
