package Prototype;

/**
 * Created by xdcao on 2017/8/22.
 */
public class SRS implements OfficialDoc {


    @Override
    public OfficialDoc clone() {
        OfficialDoc srs=null;
        try {
            srs=(OfficialDoc)super.clone();
        }catch (Exception e){
            System.out.println("不能复制");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("软件需求规格说明书");
    }
}
