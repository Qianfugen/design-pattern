package qianfg.fun.memento.improve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CareTaker {

    private Map<String, List<Memento>> records;

    public CareTaker() {
        this.records = new HashMap<>();
    }

    /**
     * 保存备忘录对象
     */
    public void addMemento(Memento memento) {
        if (records.get(memento.getName()) == null) {
            List<Memento> mementos = new ArrayList<>();
            mementos.add(memento);
            records.put(memento.getName(), mementos);
        } else {
            records.get(memento.getName()).add(memento);
        }
    }

    /**
     * 获取备忘录对象
     *
     * @param name  角色名
     * @param index 哪一次状态
     */
    public Memento getMemento(String name, int index) {
        List<Memento> mementos = records.get(name);
        if (mementos != null && mementos.size() > 0) {
            return mementos.get(index);
        }
        return null;
    }
}
