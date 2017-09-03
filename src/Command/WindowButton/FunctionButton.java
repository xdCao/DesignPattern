package Command.WindowButton;

/**
 * Created by xdcao on 2017/9/3.
 */
public class FunctionButton {

    private String name;
    private Command command;

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public FunctionButton(String name) {
        this.name = name;
    }

    public void onClick(){
        System.out.println("点击功能键");
        command.execute();
    }

}
