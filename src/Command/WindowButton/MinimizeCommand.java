package Command.WindowButton;

/**
 * Created by xdcao on 2017/9/3.
 */
public class MinimizeCommand extends Command{

    private WindowHandler windowHandler;

    public MinimizeCommand() {
        this.windowHandler = new WindowHandler();
    }

    public void execute(){
        windowHandler.minimize();
    }

}
