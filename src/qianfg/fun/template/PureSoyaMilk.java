package qianfg.fun.template;

/**
 * 原味豆奶
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantsCondiments() {
        // 原味豆奶不添加配料
        return false;
    }
}
