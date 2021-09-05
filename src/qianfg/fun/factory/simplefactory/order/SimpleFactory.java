package qianfg.fun.factory.simplefactory.order;

import qianfg.fun.factory.simplefactory.pizza.*;

public class SimpleFactory {

    // 静态工厂模式
    public static Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType) {
            case "greek":
                pizza = new Greekizza();
                pizza.setName("希腊披萨");
                break;
            case "cheese":
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
                break;
            case "pepper":
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
                break;
            case "chinese":
                pizza = new ChinesePizza();
                pizza.setName("山东煎饼果子");
            default:
                break;
        }
        return pizza;
    }
}
