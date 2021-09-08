package qianfg.fun.builder.tradition;

/**
 * 传统方式：
 *
 * 优点：简单易操作
 *
 * 缺点：产品和产品建造耦合，程序扩展和维护不好
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse house = new CommonHouse();
        house.build();
    }
}
