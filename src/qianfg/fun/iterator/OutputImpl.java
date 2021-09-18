package qianfg.fun.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    private List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printColleges() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("=========" + college.getName() + "=========");
            Iterator departmentIterator = college.createIterator();
            printDepartments(departmentIterator);
        }
    }

    public void printDepartments(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println("         " + department.getName());
        }
    }
}
