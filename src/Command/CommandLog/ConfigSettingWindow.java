package Command.CommandLog;

import Command.Calculator.AddCommand;

import java.util.ArrayList;

/**
 * Created by xdcao on 2017/9/3.
 */
public class ConfigSettingWindow {

    private ArrayList<Command> commands=new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(String args){
        command.execute(args);
        commands.add(command);
    }

    public void save(){
        FileUtil.writeCommands(commands);
    }


    public void recover(){
        ArrayList list;
        list=FileUtil.readCommands();
        for (Object obj:list){
            ((Command)obj).execute();
        }
    }


}
