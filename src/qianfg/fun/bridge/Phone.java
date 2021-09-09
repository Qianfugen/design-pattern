package qianfg.fun.bridge;

/**
 * 手机抽象层
 */
public abstract class Phone {

    // 聚合手机品牌
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call() {
        this.brand.call();
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }


}
