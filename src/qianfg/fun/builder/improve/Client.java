package qianfg.fun.builder.improve;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new CommonHouse());
        director.construct();
        System.out.println("---------------------------------------");
        director = new Director(new HighBuilding());
        director.construct();
    }
}
