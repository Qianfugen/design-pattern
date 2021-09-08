package qianfg.fun.builder.improve;

/**
 * 指挥者，这里去指定制作流程，返回产品
 */
public class Director {
    private AbstractHouse builder;

    public Director(AbstractHouse builder) {
        this.builder = builder;
    }

    /**
     * 构造房子的流程，交给指挥者
     * @return
     */
    public House construct(){
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.build();
    }
}
