package qianfg.fun.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 */
public class University extends Organization {

    private List<Organization> colleges = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Organization organization) {
        colleges.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        colleges.remove(organization);
    }

    @Override
    protected void print() {
        System.out.println("##############" + getName() + "################");
        colleges.forEach(item -> item.print());
    }
}
