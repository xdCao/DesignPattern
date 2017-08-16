package SimpleFactory;

/**
 * Created by xdcao on 2017/8/16.
 */
public class Client {

    public static void main(String[] args) {
        ChartNew chartNew=null;
        String type=XmlUtil.getChartType();
        chartNew=ChartFactory.getChart(type);
        chartNew.display();
    }

}
