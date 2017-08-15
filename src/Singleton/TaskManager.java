package Singleton;

/**
 * Created by xdcao on 2017/8/7.
 */
public class TaskManager {

    private static TaskManager tm=null;

    private TaskManager() {

    }

    public static TaskManager getInstance(){
        if (tm==null){
            tm=new TaskManager();
        }
        return tm;
    }


    public void displayProcesses(){

    }


    public void displayServices(){

    }

}
