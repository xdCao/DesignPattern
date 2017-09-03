package Command.Calculator;

import java.awt.event.ComponentAdapter;

/**
 * Created by xdcao on 2017/9/3.
 */
public class Client {

    public static void main(String[] args) {
        CalculatorForm form=new CalculatorForm();
        AbstractCommand command;
        command=new AddCommand();
        form.setCommand(command);
        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }

}
