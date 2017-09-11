package Template;

public class Client {

    public static void main(String[] args) {
        Account account;
        account=new CurrentAccount();
        account.handle("曹昊","123456");
    }

}
