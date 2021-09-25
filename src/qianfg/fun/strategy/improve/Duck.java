package qianfg.fun.strategy.improve;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected SwimBehavior swimBehavior;

    protected QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    /**
     * 嘎嘎叫
     */
    public void quack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    /**
     * 飞翔
     */
    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    /**
     * 游泳
     */
    public void swim() {
        if (swimBehavior != null) {
            swimBehavior.swim();
        }
    }
}
