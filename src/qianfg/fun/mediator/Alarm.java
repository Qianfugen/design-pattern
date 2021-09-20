package qianfg.fun.mediator;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm的同时，将自己放入到ConcreteMediator对象集合中
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startAlarm() {
        System.out.println("闹钟响了...");
    }

    public void stopAlarm() {
        System.out.println("闹钟停了...");
    }
}
