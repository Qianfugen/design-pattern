package qianfg.fun.command;

/**
 * 命令模式使得请求发送者和请求接收者消除彼此之间的耦合，让对象之间的调用关系更加灵活，实现解耦。
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("命令模式");
        RemoteController remoteController = new RemoteController(5);

        System.out.println("-------------电灯-------------");
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        System.out.println("按下开按钮");
        remoteController.onButtonWasPushed(0);
        System.out.println("按下关按钮");
        remoteController.offButtonWasPushed(0);
        System.out.println("按下撤销按钮");
        remoteController.undoButtonWasPushed();

        System.out.println("-------------电视-------------");
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        System.out.println("按下开按钮");
        remoteController.onButtonWasPushed(1);
        System.out.println("按下关按钮");
        remoteController.offButtonWasPushed(1);
        System.out.println("按下撤销按钮");
        remoteController.undoButtonWasPushed();
    }
}
