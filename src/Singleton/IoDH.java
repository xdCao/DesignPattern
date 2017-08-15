package Singleton;

/**
 * Created by xdcao on 2017/8/15.
 * 静态单例对象instance没有作为成员变量直接实例化，因此类加载时不会实例化instance
 * 第一次调用getInstance时加载内部类HolderClass，此时会首先初始化instance
 * 由java虚拟机来保证其线程安全性
 */
public class IoDH {

    private IoDH() {
    }

    private static class HolderClass{
        private final static IoDH instance=new IoDH();
    }

    public static IoDH getInstance(){
        return HolderClass.instance;
    }


    public static void main(String[] args) {
        IoDH ioDH1,ioDH2;
        ioDH1=IoDH.getInstance();
        ioDH2=IoDH.getInstance();
        System.out.println(ioDH1==ioDH2);
    }

}
