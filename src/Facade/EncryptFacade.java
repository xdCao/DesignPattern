package Facade;

/**
 * Created by xdcao on 2017/8/30.
 */
public class EncryptFacade {

    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade() {

        fileReader=new FileReader();
        cipherMachine=new CipherMachine();
        fileWriter=new FileWriter();

    }

    public void fileEncrypt(String fileNameSrc,String fileNameDes){
        String plainStr=fileReader.read(fileNameSrc);
        String encryptStr=cipherMachine.encrypt(plainStr);
        fileWriter.write(encryptStr,fileNameDes);
    }


}
