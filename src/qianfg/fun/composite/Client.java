package qianfg.fun.composite;

/**
 * 1.组合模式，创建对象组的树形结构，表示“ 整体-部分 ”的层次关系
 * 2.依据树形结构来组合对象
 * 3.结构性模式
 * 4.用户对单个对象和组合对象的访问具有一致性
 * <p>
 * Component:组合对象声明接口，在适当情况下，实现所有类共有的接口默认行为，用于访问和管理，可以使抽象类或接口
 * Leaf:在组合中表示叶子节点，叶子节点没有子节点
 * Composite:非叶子节点，用于存储子部件
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("组合模式");
        //创建学校
        University university = new University("清华大学", "顶级大学");

        //创建学院
        College computerCollege = new College("计算机学院", "top1学院");
        College infoEngineerCollege = new College("信息工程学院", "top2学院");

        //将学院添加到学校
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //创建系,将系添加到学院
        computerCollege.add(new Department("软件工程", "top1专业"));
        computerCollege.add(new Department("网络工程", "top2专业"));
        computerCollege.add(new Department("计算机科学与技术", "top3专业"));

        infoEngineerCollege.add(new Department("通信工程", "top4专业"));
        infoEngineerCollege.add(new Department("信息工程", "top5专业"));

        // 打印
        university.print();
//        infoEngineerCollege.print();
    }
}
