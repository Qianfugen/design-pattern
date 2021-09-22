package qianfg.fun.responsibilitychain;

/**
 * 副校长
 * 审批条件：10000<money<=30000
 */
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getMoney() > 10000 && request.getMoney() <= 30000) {
            System.out.println(String.format("请求（ID=%d）由%s完成审批！", request.getId(), this.name));
        } else {
            next.processRequest(request);
        }
    }
}
