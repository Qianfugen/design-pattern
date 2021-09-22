package qianfg.fun.responsibilitychain;

/**
 * 教学主任
 * 审批条件：money<=5000
 */
public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if (request.getMoney() <= 5000) {
            System.out.println(String.format("请求（ID=%d）由%s完成审批！", request.getId(), this.name));
        } else {
            next.processRequest(request);
        }
    }
}
