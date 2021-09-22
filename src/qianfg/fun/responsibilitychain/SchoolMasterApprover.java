package qianfg.fun.responsibilitychain;

/**
 * 校长
 * 审批条件：money>30000
 */
public class SchoolMasterApprover extends Approver {

    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getMoney() > 30000) {
            System.out.println(String.format("请求（ID=%d）由%s完成审批！", request.getId(), this.name));
        } else {
            next.processRequest(request);
        }
    }
}
