package Chain;

import javax.print.attribute.standard.PrinterURI;

/**
 * Created by xdcao on 2017/9/2.
 */
public class Client {

    public static void main(String[] args) {
        Approver director,vicePresident,president,congress;
        director=new Director("张无忌");
        vicePresident=new VicePresident("杨过");
        president=new President("郭靖");
        congress=new Congress("董事会");

        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);
        president.setSuccessor(congress);

        PurchaseRequest request1=new PurchaseRequest(45000,10001,"购买倚天剑");
        PurchaseRequest request2=new PurchaseRequest(60000,10002,"购买屠龙刀");
        PurchaseRequest request3=new PurchaseRequest(160000,10003,"购买九阳真经");
        PurchaseRequest request4=new PurchaseRequest(800000,10004,"购买桃花岛");

        director.processRequest(request1);
        director.processRequest(request2);
        director.processRequest(request3);
        director.processRequest(request4);

    }

}
