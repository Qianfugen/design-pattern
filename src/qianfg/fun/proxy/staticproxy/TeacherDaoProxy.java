package qianfg.fun.proxy.staticproxy;

/**
 * 代理对象
 */
public class TeacherDaoProxy implements ITeacherDao {

    // 将被代理对象聚合到代理对象内部
    private TeacherDao target;

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
