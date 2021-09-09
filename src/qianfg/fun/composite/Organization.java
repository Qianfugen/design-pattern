package qianfg.fun.composite;

public abstract class Organization {
    private String name;
    private String des;

    public Organization(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

}
