package qianfg.fun.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    //使用数组维护系
    private Department[] departments;
    private int index = 0;

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment(new Department("信息安全专业", " 信息安全专业 "));
        addDepartment(new Department("网络安全专业", " 网络安全专业 "));
        addDepartment(new Department("服务器安全专业", " 服务器安全专业 "));
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[index] = department;
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
