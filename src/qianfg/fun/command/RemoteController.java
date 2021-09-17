package qianfg.fun.command;

/**
 * 遥控器-命令发送者
 */
public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    //用于撤销命令
    private Command undoCommand;

    public RemoteController(int size) {
        onCommands = new Command[size];
        offCommands = new Command[size];
        for (int i = 0; i < size; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 设置命令
     *
     * @param index      命令下标
     * @param onCommand  开命令
     * @param offCommand 关命令
     */
    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    /**
     * 按下打开按钮
     */
    public void onButtonWasPushed(int index) {
        onCommands[index].execute();
        this.undoCommand = onCommands[index];
    }

    /**
     * 按下关闭按钮
     */
    public void offButtonWasPushed(int index) {
        offCommands[index].execute();
        this.undoCommand = offCommands[index];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }

}
