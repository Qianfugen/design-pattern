package qianfg.fun.responsibilitychain;

/**
 * 请求类
 */
public class PurchaseRequest {
    //请求ID
    private int id;
    //金额
    private double money;

    public PurchaseRequest(int id, double money) {
        this.id = id;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
