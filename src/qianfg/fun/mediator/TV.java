package qianfg.fun.mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTV() {
        System.out.println("It's time to start TV!");
    }

    public void stopTV() {
        System.out.println("It's time to stop TV!!");
    }
}
