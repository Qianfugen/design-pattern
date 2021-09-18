package qianfg.fun.observer.improve;

/**
 * 观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象是Subject,依赖的对象是Observer,Subject通知Observer变化
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("观察者模式");
        WeatherData weatherData = new WeatherData();
        weatherData.register(new BaiduSite());
        weatherData.register(new SinaSite());
        weatherData.register(new CurrentConditions());
        weatherData.setData(25.5f, 14.3f, 100.6f);
    }
}
