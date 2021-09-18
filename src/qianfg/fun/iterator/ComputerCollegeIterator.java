package qianfg.fun.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position <= departments.length - 1 && departments[position] != null;
    }

    @Override
    public Object next() {
        Department object = departments[position];
        position++;
        return object;
    }

}
