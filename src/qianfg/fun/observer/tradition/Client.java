package qianfg.fun.observer.tradition;

public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(36.8f, 12.5f, 101.1f);
        System.out.println("--------天气情况变化--------");
        weatherData.setData(40.2f, 10.0f, 100.6f);
    }
}
