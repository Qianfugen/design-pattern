package qianfg.fun.observer.improve;

/**
 * 主题
 */
public interface Subject {
    /**
     * 注册
     */
    void register(Observer observer);

    /**
     * 移除
     */
    void remove(Observer observer);

    /**
     * 通知推送
     */
    void push();
}
