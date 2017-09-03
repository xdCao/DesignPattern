package Command.WindowButton;

/**
 * Created by xdcao on 2017/9/3.
 */
public class HelpCommand extends Command {

    private HelpHandler helapHandler;

    public HelpCommand() {
        this.helapHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helapHandler.display();
    }


}
