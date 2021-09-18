package qianfg.fun.observer.improve;

/**
 * 观察者
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
