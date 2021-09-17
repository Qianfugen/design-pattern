package qianfg.fun.template;

/**
 * 模板
 */
public abstract class SoyaMilk {

    //模板方法，使用final，不让子类覆盖
    final void make() {
        select();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    //Step1.挑选黄豆
    void select() {
        System.out.println("挑选上好的黄豆");
    }

    //Step2.添加配料
    abstract void addCondiments();

    //Step3.浸泡
    void soak() {
        System.out.println("黄豆和配料浸泡3小时");
    }

    //Step4.打碎
    void beat() {
        System.out.println("黄豆和配料用豆浆机打碎");
    }

    // 钩子方法，是否添加配料(默认不做任何事，子类可视情况是否覆盖它)
    boolean customerWantsCondiments() {
        return true;
    }

}
