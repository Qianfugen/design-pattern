package qianfg.fun.visitor;

/**
 * 具体元素实现accept方法
 */
public class Man extends Person {
    @Override
    void accept(Action action) {
        action.getMenResult();
    }
}
