package qianfg.fun.command;

/**
 * 电灯-命令接受者
 * 命令接受者，知道如何实施和执行一个请求相关的操作
 */
public class LightReceiver {
    public void on() {
        System.out.println("电灯打开了。。。");
    }

    public void off() {
        System.out.println("电灯关闭了。。。");
    }
}
