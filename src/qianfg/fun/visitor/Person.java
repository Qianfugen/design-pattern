package qianfg.fun.visitor;

/**
 * 元素定义一个accept方法，接收一个访问者对象
 */
public abstract class Person {

    abstract void accept(Action action);

}
