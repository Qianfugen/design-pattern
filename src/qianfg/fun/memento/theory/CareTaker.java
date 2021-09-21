package qianfg.fun.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 守护者对象，负责保存多个备忘录对象
 */
public class CareTaker {
    private List<Memento> mementos;

    public CareTaker() {
        this.mementos = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

}
