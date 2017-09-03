package Command.Calculator;

/**
 * Created by xdcao on 2017/9/3.
 */
public class AddCommand extends AbstractCommand {

    private Adder adder=new Adder();
    private int value;

    public int execute(int value){
        this.value=value;
        return adder.add(value);
    }

    public int undo(){
        return adder.add(-value);
    }

}
