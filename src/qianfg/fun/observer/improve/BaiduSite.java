package qianfg.fun.observer.improve;

public class BaiduSite implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    public void display() {
        System.out.println("-------百度网站-------");
        System.out.println("百度气温：" + temperature);
        System.out.println("百度湿度：" + humidity);
        System.out.println("百度气压：" + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
