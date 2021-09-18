package qianfg.fun.observer.tradition;

public class CurrentConditions {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("当前气温：" + temperature);
        System.out.println("当前湿度：" + humidity);
        System.out.println("当前气压：" + pressure);
    }

}
