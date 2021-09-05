package qianfg.fun.factory.simplefactory.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给 胡椒披萨 准备原材料");
    }
}
