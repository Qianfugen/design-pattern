package qianfg.fun.state;

/**
 * 状态模式：用来解决对象在多种状态转换时，需要对外输出不同的行为
 * 当一个对象的内在状态改变时，允许改变其行为
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("状态模式");
        Context context = new Context();
        context.setState(new PublishedState());
        System.out.println(context.getCurrentState());

        //published -> not pay
        context.acceptOrderEvent(context);
        //published -> paid
        context.payOrderEvent(context);

    }
}
