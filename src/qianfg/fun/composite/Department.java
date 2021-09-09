package qianfg.fun.composite;

/**
 * 系，叶子节点
 */
public class Department extends Organization {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
