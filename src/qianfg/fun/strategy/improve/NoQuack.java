package qianfg.fun.strategy.improve;

public class NoQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会嘎嘎叫");
    }
}
