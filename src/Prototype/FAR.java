package Prototype;

/**
 * Created by xdcao on 2017/8/22.
 */
public class FAR implements OfficialDoc {


    @Override
    public OfficialDoc clone() {
        OfficialDoc far=null;
        try {
            far=(OfficialDoc)super.clone();
        }catch (Exception e){
            System.out.println("不能复制");
            return null;
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("可行性分析报告");
    }
}
