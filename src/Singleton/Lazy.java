package Singleton;

/**
 * Created by xdcao on 2017/8/7.
 * 注意volatile的必要性，以及双重检查的存在意义
 */
public class Lazy {

    private static volatile Lazy instance=null;

    private Lazy() {
    }

    public static Lazy getInstance(){
        if (instance==null){
            synchronized (Lazy.class){
                if (instance==null){
                    instance=new Lazy();
                }
            }
        }
        return instance;
    }

}
