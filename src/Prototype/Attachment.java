package Prototype;

import java.io.Serializable;

/**
 * Created by xdcao on 2017/8/22.
 */
public class Attachment implements Serializable{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void download(){
        System.out.println("下载附件，文件名为"+name);
    }

}
