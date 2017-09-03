package Command.CommandLog;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by xdcao on 2017/9/3.
 */
public class FileUtil {

    public static void writeCommands(ArrayList<Command> commands) {
        try {
            FileOutputStream file=new FileOutputStream("config.log");
            ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(file));
            oos.writeObject(commands);
            oos.close();
        }catch (Exception e){
            System.out.println("命令保存失败");
            e.printStackTrace();
        }
    }

    public static ArrayList readCommands() {

        try {
            FileInputStream file=new FileInputStream("config.log");
            ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(file));
            ArrayList commands=(ArrayList)ois.readObject();
            ois.close();
            return commands;
        }catch (Exception e){
            System.out.println("命令读取失败");
            e.printStackTrace();
            return null;
        }

    }
}
