package qianfg.fun.facade;

/**
 * 1.外观模式为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，使用子系统更加容易使用
 * 2.外观模式通过定义一个一致的接口，用以屏蔽内部子系统的细节，使得调用端只需跟这个接口发生调用，而不需关心这个子系统的内部细节
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("外观模式");
        Home home = new Home();
        System.out.println("1.准备");
        home.ready();
        System.out.println("2.播放");
        home.play();
        System.out.println("3.暂停");
        home.pause();
        System.out.println("4.结束");
        home.end();
    }
}
