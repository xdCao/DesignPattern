package Facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by xdcao on 2017/8/30.
 */
public class FileReader {

    public String read(String fileNameSrc){
        System.out.println("读取文件，获取明文");
        StringBuffer sb=new StringBuffer();
        try {
            FileInputStream fis=new FileInputStream(fileNameSrc);
            int data;
            while ((data=fis.read())!=-1){
                sb=sb.append((char)data);
            }
            fis.close();
            System.out.println(sb);
        }catch (FileNotFoundException e){
            System.err.println("文件不存在");
        }catch (IOException e){
            System
                    .err.println("文件操作错误");
        }
        return sb.toString();
    }

}
