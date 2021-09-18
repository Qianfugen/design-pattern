package qianfg.fun.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    private List<Department> departments;
    private int position = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position <= departments.size() - 1;
    }

    @Override
    public Object next() {
        Department object = departments.get(position);
        position++;
        return object;
    }
}
