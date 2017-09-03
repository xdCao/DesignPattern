package Command.WindowButton;



/**
 * Created by xdcao on 2017/9/3.
 */
public class Client {

    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow=new FBSettingWindow("功能键设置");
        FunctionButton fb1,fb2;
        fb1=new FunctionButton("功能键1");
        fb2=new FunctionButton("功能键2");
        Command command1,command2;
        command1=new HelpCommand();
        command2=new MinimizeCommand();
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbSettingWindow.addFunctionButton(fb1);
        fbSettingWindow.addFunctionButton(fb2);

        fbSettingWindow.display();

        fb1.onClick();
        fb2.onClick();


    }


}
