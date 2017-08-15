package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by xdcao on 2017/8/7.
 */
public class LoadBalancer {

    private static LoadBalancer instance=null;

    private List serverList=null;

    private LoadBalancer(){
        serverList=new ArrayList();
    }

    public static LoadBalancer getInstance(){
        if (instance==null){
            instance=new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public void removeServer(String server){
        serverList.remove(server);
    }

    public String getServer(){
        Random random=new Random();
        return (String)serverList.get(random.nextInt(serverList.size()));
    }

}
