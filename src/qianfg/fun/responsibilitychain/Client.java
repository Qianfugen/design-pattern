package qianfg.fun.responsibilitychain;

/**
 * 职责链模式，又叫责任链模式，为请求创建一个接收者对象的链。对请求的发送者和接收者进行解耦
 * 职责连模式通常每个接收者包含对另一个接收者的引用，如果该对象不能处理该请求，会将请求丢给下一个接收者
 * 属于行为型模式
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("责任链模式");

        //构建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 8888.88);

        //创建相关的审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("陆校长");

        //需要将各个审批级别的下一个设置好 (处理人构成环形: )
        departmentApprover.setNext(collegeApprover);
        collegeApprover.setNext(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setNext(schoolMasterApprover);
        schoolMasterApprover.setNext(departmentApprover);

        //处理审批
        departmentApprover.processRequest(purchaseRequest);

    }
}
