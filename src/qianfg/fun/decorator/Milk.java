package qianfg.fun.decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDes("milk");
        setPrice(0.6f);
    }
}
