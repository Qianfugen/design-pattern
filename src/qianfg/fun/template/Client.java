package qianfg.fun.template;

/**
 * 在一个抽象类公开定义了执行它的方法的模板。它的子类可以按照需求重写方法实现，但是调用抽象类中定义的方法进行。
 * 简单的说，模板方法模式定义了一个操作中的算法骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构，就可以重新定义该算法的某些特定步骤
 * 属性行为型模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("模板方法模式");

        System.out.println("-----------制作黑米豆奶---------");
        BlackRiceSoyaMilk blackRiceSoyaMilk = new BlackRiceSoyaMilk();
        blackRiceSoyaMilk.make();

        System.out.println("-----------制作花生豆奶---------");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("-----------制作原味豆奶---------");
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
