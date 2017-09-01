package Proxy;

/**
 * Created by xdcao on 2017/9/1.
 */
public class Client {

    public static void main(String[] args) {
        Searcher searcher=new ProxySearcher();
        searcher.doSearch("杨过","小龙女");
    }

}
