package qianfg.fun.strategy.tradition;

public class PekingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("北京鸭");
    }

    @Override
    public void swim() {
        System.out.println("北京鸭不会游泳");
    }
}
