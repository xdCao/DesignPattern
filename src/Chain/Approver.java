package Chain;

/**
 * Created by xdcao on 2017/9/2.
 */
public abstract class Approver {

    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }


    public abstract void processRequest(PurchaseRequest request);

}
