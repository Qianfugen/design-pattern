package qianfg.fun.mediator;

public abstract class Mediator {
    //将中介者对象，加入到集合中
    abstract void register(String colleagueName, Colleague colleague);

    //接收消息，具体的同事对象发出
    abstract void getMessage(int stateChange, String colleagueName);

}
