package qianfg.fun.strategy.tradition;

public class Client {
    public static void main(String[] args) {
        System.out.println("-------野鸭--------");
        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.quack();
        wildDuck.fly();
        wildDuck.swim();

        System.out.println("-------北京鸭--------");
        Duck   pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.quack();
        pekingDuck.fly();
        pekingDuck.swim();

        System.out.println("-------玩具鸭--------");
        Duck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.quack();
        toyDuck.fly();
        toyDuck.swim();
    }
}
