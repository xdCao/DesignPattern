package Facade;

/**
 * Created by xdcao on 2017/8/30.
 */
public class Client {

    public static void main(String[] args) {
        EncryptFacade encryptFacade=new EncryptFacade();
        encryptFacade.fileEncrypt("Facade//src.txt","des.txt");
    }

}
