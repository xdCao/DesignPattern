package SimpleFactory;

/**
 * Created by xdcao on 2017/8/16.
 */
public class ChartFactory {

    public static ChartNew getChart(String arg){

        ChartNew chartNew=null;

        if (arg.equalsIgnoreCase("histogram")){
            chartNew=new HistogramChart();
            System.out.println("初始化柱状图");
        }else if (arg.equalsIgnoreCase("pie")){
            chartNew=new PieChart();
            System.out.println("初始化饼状图");
        }else if (arg.equalsIgnoreCase("line")){
            chartNew=new LineChart();
            System.out.println("初始化折线图");
        }

        return chartNew;
    }

}
