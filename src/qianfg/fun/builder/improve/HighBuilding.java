package qianfg.fun.builder.improve;

/**
 * 具体建造者
 */
public class HighBuilding extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高层建筑打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高层建筑砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高层建筑盖屋顶");
    }
}
