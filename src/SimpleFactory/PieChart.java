package SimpleFactory;

/**
 * Created by xdcao on 2017/8/16.
 */
public class PieChart implements ChartNew {

    public PieChart() {

        System.out.println("创建饼状图");

    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
