package qianfg.fun.decorator;

public abstract class Drink {
    private float price;
    private String des;

    //具体消费，由子类实现
    public abstract float cost();

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
