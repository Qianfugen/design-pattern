package qianfg.fun.visitor;

/**
 * 具体访问者，实现每一个抽象访问者声明的操作，是每个操作实现的部分
 */
public class Success extends Action {
    @Override
    void getMenResult() {
        System.out.println("男评委对歌手评价：成功！");
    }

    @Override
    void getWomanResult() {
        System.out.println("女评委对歌手评价：成功！");
    }
}
