package qianfg.fun.strategy.improve;

public class ToyDuck extends Duck {

    public ToyDuck() {
        this.flyBehavior = new NoFly();
        this.swimBehavior = new NoSwim();
        this.quackBehavior = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }
}
