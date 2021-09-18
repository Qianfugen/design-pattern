package qianfg.fun.visitor;

/**
 * 具体元素实现accept方法
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getWomanResult();
    }
}
