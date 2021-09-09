package qianfg.fun.bridge;

public class FlodedPhone extends Phone {

    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机开机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机关机");
    }
}
