package qianfg.fun.factory.factorymethod.order;

import qianfg.fun.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    Pizza pizza = null;
    String orderType = "";

    // 定义一个抽象方法，由子类工厂去实现
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有此类披萨，订购披萨失败！");
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
