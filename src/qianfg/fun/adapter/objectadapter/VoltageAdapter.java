package qianfg.fun.adapter.objectadapter;

/**
 * 适配器类
 * 1.根据“合成复用原则”，尽量用关联关系（聚合）来代替继承关系
 */
public class VoltageAdapter implements IVoltage5V {

    // 使用聚合，避免继承
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            dst = src / 44;
        }
        return dst;
    }
}
