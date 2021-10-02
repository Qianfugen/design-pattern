package qianfg.fun.state;

/**
 * 环境上下文
 */
public class Context extends AbstractState {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void checkEvent(Context context) {
        state.checkEvent(context);
        getCurrentState();
    }

    @Override
    public void checkFailEvent(Context context) {
        state.checkFailEvent(context);
        getCurrentState();
    }

    @Override
    public void makePriceEvent(Context context) {
        state.makePriceEvent(context);
        getCurrentState();
    }

    @Override
    public void acceptOrderEvent(Context context) {
        state.acceptOrderEvent(context);
        getCurrentState();
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        state.notPeopleAcceptEvent(context);
        getCurrentState();
    }

    @Override
    public void payOrderEvent(Context context) {
        state.payOrderEvent(context);
        getCurrentState();
    }

    @Override
    public void feedBackEvent(Context context) {
        state.feedBackEvent(context);
        getCurrentState();
    }

    @Override
    public String getCurrentState() {
        System.out.println("当前状态：" + state.getCurrentState());
        return state.getCurrentState();
    }
}
