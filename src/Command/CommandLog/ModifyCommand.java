package Command.CommandLog;

/**
 * Created by xdcao on 2017/9/3.
 */
public class ModifyCommand extends Command{


    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args=args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }
}
