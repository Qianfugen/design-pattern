package qianfg.fun.memento.improve;

public class GameRole {
    //角色名
    private String name;
    //攻击力
    private int vit;
    //防御力
    private int def;

    public GameRole(String name, int vit, int def) {
        this.name = name;
        this.vit = vit;
        this.def = def;
    }

    /**
     * 保存当前状态
     */
    public Memento createMemento() {
        return new Memento(this.name, this.vit, this.def);
    }

    /**
     * 从备忘录对象恢复状态值
     */
    public void recoverFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    /**
     * 输出状态信息
     */
    public void display() {
        System.out.println(name + " 当前的攻击力：" + this.vit + " 防御力：" + this.def);
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
