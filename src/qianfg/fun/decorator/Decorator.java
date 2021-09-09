package qianfg.fun.decorator;

/**
 * 组合+继承模式，实现套娃
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 自己的价格+被装饰者的费用（费用叠加）
        return this.getPrice() + this.drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + " && " + this.drink.getDes();
    }
}
