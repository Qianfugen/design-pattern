package qianfg.fun.visitor;

/**
 * 抽象访问者，为该对象结构中的ConcreteElement的每一个类声明一个visit操作
 */
public abstract class Action {

    abstract void getMenResult();

    abstract void getWomanResult();

}
