package qianfg.fun.factory.factorymethod.order;

import qianfg.fun.factory.factorymethod.pizza.*;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setName("北京胡椒披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("北京奶酪");
        }
        return pizza;
    }
}
