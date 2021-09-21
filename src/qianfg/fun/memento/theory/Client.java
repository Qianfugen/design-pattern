package qianfg.fun.memento.theory;

public class Client {
    public static void main(String[] args) {
        System.out.println("备忘录模式");

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("状态1 攻击力100");
        //保存当前状态
        careTaker.addMemento(originator.saveStateMemento());

        originator.setState("状态2 攻击力80");
        careTaker.addMemento(originator.saveStateMemento());

        originator.setState("状态3 攻击力50");
        careTaker.addMemento(originator.saveStateMemento());

        //回复到状态1
        System.out.println("恢复前状态：" + originator.getState());
        originator.recoverStateFromMemento(careTaker.getMemento(0));
        System.out.println("恢复后状态：" + originator.getState());
    }
}
