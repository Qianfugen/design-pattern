package qianfg.fun.proxy.staticproxy;

/**
 * 被代理对象
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中。。。");
    }
}
