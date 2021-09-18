package qianfg.fun.observer.improve;

public class SinaSite implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    public void display() {
        System.out.println("-------新浪网站-------");
        System.out.println("新浪气温：" + temperature);
        System.out.println("新浪湿度：" + humidity);
        System.out.println("新浪气压：" + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
