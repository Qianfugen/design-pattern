package qianfg.fun.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        this.flyBehavior = new WellFly();
        this.swimBehavior = new WellSwim();
        this.quackBehavior = new WellQuack();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }
}
