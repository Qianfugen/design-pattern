package qianfg.fun.mediator;

public abstract class Colleague {
    private Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMessage(int stateChange);

    public Mediator getMediator() {
        return mediator;
    }
}
