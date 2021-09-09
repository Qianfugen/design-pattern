package qianfg.fun.adapter.interfaceadapter;

/**
 * 接口适配器模式
 * 当不需要全部实现接口提供的方法时，可以先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），
 * 那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
 * <p>
 * 适用于一个接口不想使用其所有方法的情况
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("接口适配器模式");
        AbstractAdapter adapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("重写了m1方法");
            }
        };

        adapter.m1();
    }
}
