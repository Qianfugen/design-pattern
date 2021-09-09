package qianfg.fun.decorator;

/**
 * 1.动态的将新功能附加到对象上，功能扩展方面，比继承更有弹性，体现了开闭原则
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("装饰者模式");
        System.out.println("=================下单2份巧克力+1份牛奶的LongBlack=============");

        System.out.println("下单一份LongBlack");
        Drink order = new LongBlack();
        System.out.println("1份LongBlack的费用：" + order.cost());
        System.out.println("1份LongBlack的描述：" + order.getDes());

        System.out.println("加1份牛奶");
        order = new Milk(order);
        System.out.println("加1份牛奶后的费用：" + order.cost());
        System.out.println("加1份牛奶后的描述：" + order.getDes());

        System.out.println("再加1份巧克力");
        order = new Chocolate(order);
        System.out.println("再加1份巧克力后的费用：" + order.cost());
        System.out.println("再加1份巧克力后的描述：" + order.getDes());

        System.out.println("加2份巧克力");
        order = new Chocolate(order);
        System.out.println("加2份巧克力后的费用：" + order.cost());
        System.out.println("加2份巧克力后的描述：" + order.getDes());
    }
}
