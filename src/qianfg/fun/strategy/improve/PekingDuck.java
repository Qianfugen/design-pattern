package qianfg.fun.strategy.improve;

public class PekingDuck extends Duck {

    public PekingDuck() {
        this.flyBehavior = new NoFly();
        this.swimBehavior = new WellSwim();
        this.quackBehavior = new WellQuack();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
