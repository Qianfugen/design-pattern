package qianfg.fun.memento.theory;

/**
 * 对象，需要保存状态的对象
 */
public class Originator {

    private String state;

    /**
     * 保存一个状态对象 Memento
     */
    public Memento saveStateMemento() {
        return new Memento(this.state);
    }

    /**
     * 从备忘录对象恢复
     */
    public void recoverStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
