package qianfg.fun.factory.absfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给 伦敦奶酪披萨 准备原材料");
    }
}
