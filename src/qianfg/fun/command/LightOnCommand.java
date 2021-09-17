package qianfg.fun.command;

/**
 * 具体命令-灯打开命令
 * 将一个接受者对象和一个动作绑定，调用接受者相应的操作，实现execute
 */
public class LightOnCommand implements Command {

    //把命令执行者-电灯聚合到命令里
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
