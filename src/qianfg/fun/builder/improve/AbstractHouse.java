package qianfg.fun.builder.improve;

/**
 * 抽象建造者,创建一个product对象
 */
public abstract class AbstractHouse {

    House house = new House();

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //盖屋顶
    public abstract void roofed();

    public House build() {
        return house;
    }
}
