package qianfg.fun.memento.improve;

/**
 * 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样就可以将该对象恢复到原先保存的状态。
 * 备忘录模式属于行为型模式
 */
public class Client {
    /**
     * 忍者神龟
     * 1、蓝色头擅带双刀的达芬奇。
     * 2、红色头带擅长双叉的拉斐尔。
     * 3、紫色头带擅用长棍的多纳泰罗。
     * 4、橙色头带最爱搞笑的双截棍高手米开朗基罗
     */
    public static void main(String[] args) {
        System.out.println("备忘录模式");

        CareTaker careTaker = new CareTaker();
        GameRole gameRole1 = new GameRole("达芬奇", 100, 100);
        GameRole gameRole2 = new GameRole("拉斐尔", 90, 100);
        GameRole gameRole3 = new GameRole("多纳泰罗", 80, 100);
        GameRole gameRole4 = new GameRole("米开朗基罗", 70, 100);
        System.out.println("------------与boss大战前-------------");
        gameRole1.display();
        gameRole2.display();
        gameRole3.display();
        gameRole4.display();

        System.out.println("------------赶紧存档-------------");
        careTaker.addMemento(gameRole1.createMemento());
        careTaker.addMemento(gameRole2.createMemento());
        careTaker.addMemento(gameRole3.createMemento());
        careTaker.addMemento(gameRole4.createMemento());

        System.out.println("------------与boss大战后-------------");
        gameRole1.setDef(90);
        gameRole1.setVit(90);
        gameRole2.setDef(80);
        gameRole2.setVit(80);
        gameRole3.setDef(70);
        gameRole3.setVit(70);
        gameRole4.setDef(60);
        gameRole4.setVit(60);
        gameRole1.display();
        gameRole2.display();
        gameRole3.display();
        gameRole4.display();

        System.out.println("------------存档恢复-------------");
        gameRole1.recoverFromMemento(careTaker.getMemento(gameRole1.getName(), 0));
        gameRole2.recoverFromMemento(careTaker.getMemento(gameRole2.getName(), 0));
        gameRole3.recoverFromMemento(careTaker.getMemento(gameRole3.getName(), 0));
        gameRole4.recoverFromMemento(careTaker.getMemento(gameRole4.getName(), 0));
        gameRole1.display();
        gameRole2.display();
        gameRole3.display();
        gameRole4.display();

    }
}
