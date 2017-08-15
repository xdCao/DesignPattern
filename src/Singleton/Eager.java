package Singleton;

/**
 * Created by xdcao on 2017/8/7.
 */
public class Eager {

    private static final Eager instance=new Eager();

    private Eager() {
    }

    public static Eager getInstance(){
        return instance;
    }

}
