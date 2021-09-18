package qianfg.fun.iterator;

import java.util.Iterator;

public interface College {

    /**
     * 获取学院名称
     */
    String getName();

    /**
     * 添加系的方法
     */
    void addDepartment(Department department);

    /**
     * 创建迭代器
     */
    Iterator createIterator();

}
