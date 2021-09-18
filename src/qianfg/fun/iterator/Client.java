package qianfg.fun.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式是常用的设计模式，属于行为型设计模式
 * 应用场景：如果我们的集合元素是使用不同的方式实现的，有数组、java的集合类，或者其他，当客户端需要遍历这些集合元素，会使用多种遍历方式，还会
 * 暴露元素的内部结构，可以考虑使用迭代器模式
 * 提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层实现，即：不暴露其内部结构
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("迭代器模式");
        List<College> collegeList = new ArrayList<>();
        //计算机学院
        ComputerCollege computerCollege = new ComputerCollege();
        collegeList.add(computerCollege);

        //信息学院
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(infoCollege);

        //打印
        OutputImpl output = new OutputImpl(collegeList);
        output.printColleges();
    }
}
