package qianfg.fun.strategy.tradition;

public abstract class Duck {

    public Duck() {
    }

    /**
     * 显示鸭子信息
     */
    public abstract void display();

    /**
     * 嘎嘎叫
     */
    public void quack(){
        System.out.println("鸭子会嘎嘎叫");
    }

    /**
     * 飞翔
     */
    public void fly(){
        System.out.println("鸭子会飞翔");
    }

    /**
     * 游泳
     */
    public void swim(){
        System.out.println("鸭子会游泳");
    }
}
