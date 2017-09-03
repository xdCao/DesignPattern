package Command.CommandLog;

/**
 * Created by xdcao on 2017/9/3.
 */
public class InsertCommand extends Command {


    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args=args;
        configOperator.insert(args);
    }

    @Override
    public void execute() {
        configOperator.insert(this.args);
    }
}
