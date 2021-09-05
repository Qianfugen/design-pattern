package qianfg.fun.factory.absfactory.order;

import qianfg.fun.factory.absfactory.pizza.Pizza;

//一个抽象工厂模式的抽象层
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
