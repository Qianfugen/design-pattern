package qianfg.fun.responsibilitychain;

/**
 * 采购员采购教学器材
 * 如果金额 小于等于 5000, 由教学主任审批
 * 如果金额 小于等于 10000, 由院长审批
 * 如果金额 小于等于 30000, 由副校长审批
 * 如果金额 超过 30000 以上，有校长审批
 */
public abstract class Approver {
    //下一个处理者
    protected Approver next;
    //名称
    protected String name;

    abstract void processRequest(PurchaseRequest request);

    public Approver(String name) {
        this.name = name;
    }

    public void setNext(Approver next) {
        this.next = next;
    }
}
