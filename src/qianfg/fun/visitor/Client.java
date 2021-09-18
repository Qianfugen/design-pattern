package qianfg.fun.visitor;

/**
 * 访问者模式，封装一些作用于某种数据结构的各元素的操作，他可以在不改变数据结构的前提下，定义作用于这些元素的新操作
 * 主要将数据结构与数据操作分离，解决数据结构和操作耦合性问题
 * 基本原理：在被访问的类里面添加一个对外提供接待访问者的接口
 * 应用场景：需要对一个对象结构中的对象进行很多不同操作（这些操作彼此没有关联），同时需要避免让这些操作“污染”这些对象的类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("观察者模式");
        //创建数据结构
        ObjectStructure structure = new ObjectStructure();

        structure.addPerson(new Man());
        structure.addPerson(new Woman());

        //成功
        System.out.println("----------成功评价----------");
        Success success = new Success();
        structure.display(success);

        //失败
        System.out.println("----------失败评价----------");
        Fail fail = new Fail();
        structure.display(fail);

        //待定
        System.out.println("----------待定评价----------");
        Wait wait = new Wait();
        structure.display(wait);
    }
}
