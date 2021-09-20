package qianfg.fun.mediator;

/**
 * 中介者模式，用一个中介对象来封装一系类的对象交互。中介者使用各个对象不需要显式地互相引用，从而使其耦合送饭，
 * 而且可以独立地改变他们之间的交互
 * 中介者模式属于行为型模式，使代码易于维护
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("中介者模式");

        ConcreteMediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "alarm");
        TV tv = new TV(mediator, "TV");
        alarm.sendMessage(0);
        alarm.sendMessage(1);
    }
}
