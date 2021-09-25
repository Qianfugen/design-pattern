package qianfg.fun.strategy.improve;

/**
 * 策略模式（Strategy Pattern）中，定义算法族（策略组），分别封装起来，让他们之间可以互相替换，
 * 此模式让算法的变化独立于使用算法的客户
 * 这算法体现了几个设计原则，第一、把变化的代码从不变的代码中分离出来；第二、针对接口编程而不是具体
 * 类（定义了策略接口）；第三、多用组合/聚合，少用继承（客户通过组合方式使用策略）。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("策略模式");

        System.out.println("-------------野鸭------------");
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
        wildDuck.swim();
        wildDuck.quack();

        System.out.println("-------------北京鸭------------");
        Duck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.swim();
        pekingDuck.quack();

        System.out.println("-------------玩具鸭------------");
        Duck toyDuck = new ToyDuck();
        toyDuck.fly();
        toyDuck.swim();
        toyDuck.quack();
    }
}
