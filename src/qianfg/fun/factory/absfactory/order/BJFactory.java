package qianfg.fun.factory.absfactory.order;

import qianfg.fun.factory.absfactory.pizza.BJCheesePizza;
import qianfg.fun.factory.absfactory.pizza.BJPepperPizza;
import qianfg.fun.factory.absfactory.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪披萨");
        }
        return pizza;
    }
}
