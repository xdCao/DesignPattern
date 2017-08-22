package AbstractFactory;

/**
 * Created by xdcao on 2017/8/22.
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
