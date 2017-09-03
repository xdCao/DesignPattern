package Command.CommandLog;

/**
 * Created by xdcao on 2017/9/3.
 */
public class Client {

    public static void main(String[] args) {

      ConfigSettingWindow csw=new ConfigSettingWindow();
      Command command;
      ConfigOperator co=new ConfigOperator();

      command=new InsertCommand("增加");
      command.setConfigOperator(co);
      csw.setCommand(command);
      csw.call("网站首页");

      command=new InsertCommand("增加");
      command.setConfigOperator(co);
      csw.setCommand(command);
      csw.call("端口号");

        command=new ModifyCommand("修改");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("网站首页");

        command=new ModifyCommand("修改");
        command.setConfigOperator(co);
        csw.setCommand(command);
        csw.call("端口号");


        System.out.println("----------------------------------");
        System.out.println("保存配置");
        csw.save();

        System.out.println("----------------------------------");
        System.out.println("恢复配置");
        csw.recover();



    }

}
