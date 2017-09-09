package StatePattern;

public class Client {

    public static void main(String[] args) {
        Account acc=new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withDraw(2000);
        acc.deposit(3000);
        acc.withDraw(4000);
        acc.withDraw(1000);
        acc.computeInterest();
    }


}
