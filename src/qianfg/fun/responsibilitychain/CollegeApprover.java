package qianfg.fun.responsibilitychain;

/**
 * 院长
 * 审批条件：5000<money<=10000
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getMoney() > 5000 && request.getMoney() <= 10000) {
            System.out.println(String.format("请求（ID=%d）由%s完成审批！", request.getId(), this.name));
        } else {
            next.processRequest(request);
        }
    }
}
