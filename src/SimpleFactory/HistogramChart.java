package SimpleFactory;

/**
 * Created by xdcao on 2017/8/16.
 */
public class HistogramChart implements ChartNew {

    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
