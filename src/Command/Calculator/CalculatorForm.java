package Command.Calculator;

/**
 * Created by xdcao on 2017/9/3.
 */
public class CalculatorForm {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void compute(int value){
        int i=command.execute(value);
        System.out.println("执行运算，计算结果为： "+i);
    }

    public void undo(){
        int i=command.undo();
        System.out.println("执行撤销，运算结果为： "+i);
    }




}
