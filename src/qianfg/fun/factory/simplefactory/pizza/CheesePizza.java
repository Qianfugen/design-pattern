package qianfg.fun.factory.simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给 奶酪披萨 准备原材料");
    }
}
