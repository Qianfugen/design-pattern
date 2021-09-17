package qianfg.fun.command;

/**
 * 具体命令-灯关闭命令
 * 将一个接受者对象和一个动作绑定，调用接受者相应的操作，实现execute
 */
public class LightOffCommand implements Command {

    //把命令执行者-电灯聚合到命令里
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
