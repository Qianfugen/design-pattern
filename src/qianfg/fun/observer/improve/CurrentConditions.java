package qianfg.fun.observer.improve;

public class CurrentConditions implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    public void display() {
        System.out.println("-------天气情况-------");
        System.out.println("当前气温：" + temperature);
        System.out.println("当前湿度：" + humidity);
        System.out.println("当前气压：" + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
