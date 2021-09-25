package qianfg.fun.strategy.improve;

public class NoSwim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
