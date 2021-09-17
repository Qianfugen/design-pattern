package qianfg.fun.command;

/**
 * 命令角色，需要执行的所有命令都在这里，可以是接口或抽象类
 */
public interface Command {
    /**
     * 执行动作
     */
    void execute();

    /**
     * 撤销动作
     */
    void undo();
}
