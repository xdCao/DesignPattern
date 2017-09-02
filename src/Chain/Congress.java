package Chain;

/**
 * Created by xdcao on 2017/9/2.
 */
public class Congress extends Approver{

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会"+this.name+"审批采购单： "+request.getNumber()+",金额： "+request.getAmount()+
                "元， 采购目的： "+request.getPurpose());
    }
}
