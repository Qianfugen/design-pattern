package qianfg.fun.bridge;

/**
 * 1.将实现与抽象放在两个不同的类层次中，使两个层次可以独立改变
 * 2.是一种结构型设计模式
 * 3.基于最小设计原则，通过使用封装、聚合及继承等行为，让不同的类承担不同的职责。
 * 把抽象和行为实现分离，保证各部分的独立性和功能扩展
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("桥接模式");
        Phone phone1 = new FlodedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("=============================================");
        UpRightPhone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("=============================================");
        FlodedPhone phone3 = new FlodedPhone(new HuaWei());
        phone3.open();
        phone3.call();
        phone3.close();
        System.out.println("=============================================");
        UpRightPhone phone4 = new UpRightPhone(new HuaWei());
        phone4.open();
        phone4.call();
        phone4.close();
    }
}
