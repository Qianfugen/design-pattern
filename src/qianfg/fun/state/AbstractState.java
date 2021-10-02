package qianfg.fun.state;

/**
 * 抽象类，默认实现State的所有接口
 * 该类的所有方法，其子类可以有选择性的进行重写
 */
public abstract class AbstractState implements State {

    protected static final RuntimeException EXCEPTION = new RuntimeException("非法操作");

    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }

}
