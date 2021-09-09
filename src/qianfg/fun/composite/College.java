package qianfg.fun.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends Organization {

    private List<Organization> departments = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Organization organization) {
        departments.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        departments.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("------------" + getName() + "--------------");
        departments.forEach(item -> item.print());
    }
}
