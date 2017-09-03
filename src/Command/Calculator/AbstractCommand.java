package Command.Calculator;

/**
 * Created by xdcao on 2017/9/3.
 */
public abstract class AbstractCommand {

    public abstract int execute(int value);
    public abstract int undo();

}
