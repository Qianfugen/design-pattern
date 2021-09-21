package qianfg.fun.memento.improve;

public class Memento {
    //角色名
    private String name;
    //攻击力
    private int vit;
    //防御力
    private int def;

    public Memento(String name, int vit, int def) {
        this.name = name;
        this.vit = vit;
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
