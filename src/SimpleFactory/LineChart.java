package SimpleFactory;

/**
 * Created by xdcao on 2017/8/16.
 */
public class LineChart implements ChartNew {

    public LineChart() {
        System.out.println("创建折线图");
    }

    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
