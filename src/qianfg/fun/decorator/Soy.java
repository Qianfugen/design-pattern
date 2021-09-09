package qianfg.fun.decorator;

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDes("soy");
        setPrice(0.7f);
    }
}
