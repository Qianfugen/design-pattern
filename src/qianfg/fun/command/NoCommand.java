package qianfg.fun.command;

/**
 * 空命令，用于初始化，避免空判断
 * 也是一种设计模式
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
