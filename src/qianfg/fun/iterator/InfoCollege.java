package qianfg.fun.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    //使用列表维护系
    List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment(new Department("Java专业", " Java专业 "));
        addDepartment(new Department("PHP专业", " PHP专业 "));
        addDepartment(new Department("大数据专业", " 大数据专业 "));
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
