package qianfg.fun.flyweight;

/**
 * 具体的享元角色，实现抽象角色定义的相关业务
 */
public class ConcreteWebSite extends WebSite {

    public ConcreteWebSite(String type) {
        super(type);
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型为：" + getType() + ",使用者为：" + user.getName());
    }
}
