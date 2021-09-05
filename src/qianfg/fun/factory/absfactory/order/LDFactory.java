package qianfg.fun.factory.absfactory.order;

import qianfg.fun.factory.absfactory.pizza.LDCheesePizza;
import qianfg.fun.factory.absfactory.pizza.LDPepperPizza;
import qianfg.fun.factory.absfactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪披萨");
        }
        return pizza;
    }
}
