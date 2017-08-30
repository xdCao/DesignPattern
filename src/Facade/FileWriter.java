package Facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by xdcao on 2017/8/30.
 */
public class FileWriter {

    public void write(String encrypt,String fileNameDes){
        System.out.println("保存密文，写入文件");
        try {
            FileOutputStream fos=new FileOutputStream(fileNameDes);
            fos.write(encrypt.getBytes());
            fos.close();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件操作错误");
        }
    }

}
