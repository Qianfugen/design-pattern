package qianfg.fun.state;

/**
 * 各种具体的状态类
 */
class GENERATE extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }

    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewedState());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedBackedState());
    }
}

class ReviewedState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }

    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishedState());
    }
}

class PublishedState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }

    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackedState());
    }
}

class NotPayState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }

    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackedState());
    }
}

class PaidState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackedState());
    }
}

class FeedBackedState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}

