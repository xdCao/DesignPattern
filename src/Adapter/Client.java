package Adapter;

import java.io.OptionalDataException;

/**
 * Created by xdcao on 2017/8/26.
 */
public class Client {

    public static void main(String[] args) {
        ScoreOperation scoreOperation;
        scoreOperation=new OperationAdapter();
        int scores[]={84,76,50,69,90,91,88,96};
        int result[];
        int score;
        System.out.println("成绩排序结果：");
        result=scoreOperation.sort(scores);
        for (int i:result){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("查找成绩90：");
        score=scoreOperation.search(result,90);
        if (score!=-1){
            System.out.println("找到成绩90");
        }else {
            System.out.println("没有找到成绩90");
        }

    }

}
