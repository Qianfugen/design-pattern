package qianfg.fun.memento.theory;

/**
 * 备忘录对象，负责保存好记录
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
