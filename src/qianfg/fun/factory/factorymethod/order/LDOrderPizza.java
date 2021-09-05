package qianfg.fun.factory.factorymethod.order;

import qianfg.fun.factory.factorymethod.pizza.LDCheesePizza;
import qianfg.fun.factory.factorymethod.pizza.LDPepperPizza;
import qianfg.fun.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
            pizza.setName("伦敦胡椒披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("伦敦奶酪");
        }
        return pizza;
    }
}
