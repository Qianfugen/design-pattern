package qianfg.fun.flyweight;

/**
 * 抽象的享元角色，同时定义出对象的外部状态和内部状态的接口或实现
 */
public abstract class WebSite {

    /**
     * 内部状态，存储在享元对象内部，不会随环境而改变
     */
    private String type;

    /**
     * 外部状态，非共享，随环境改变而改变
     */
    public abstract void use(User user);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebSite(String type) {
        this.type = type;
    }
}
