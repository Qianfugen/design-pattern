package qianfg.fun.adapter.classadapter;

/**
 * 适配器类
 * 1.Java的单继承机制，适配器需要继承src类，这就要求dst必须是接口，有局限性
 * 2.src类的方法再Adapter暴露出来，增加使用成本
 * 3.继承了src类，可以根据需求重写src类方法，比较灵活
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }
}
