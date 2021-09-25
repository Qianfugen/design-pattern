package qianfg.fun.strategy.improve;

public class WellQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("会嘎嘎叫");
    }
}
