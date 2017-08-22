package Prototype;

import java.io.IOException;

/**
 * Created by xdcao on 2017/8/22.
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        WeeklyLog pre=new WeeklyLog();
        pre.setName("张无忌");
        pre.setContent("这周工作很忙，每天加班");
        pre.setDate("第12周");
        pre.setAttachment(new Attachment());
        System.out.println(pre);

        WeeklyLog newlog= pre.deepClone();
        newlog.setDate("第13周");
        System.out.println(newlog);

//        System.out.println(pre.getDate()==newlog.getDate());
//        System.out.println(pre.getName()==newlog.getName());
//        System.out.println(pre.getContent()==newlog.getContent());

        System.out.println(pre.getAttachment()==newlog.getAttachment());


    }

}
