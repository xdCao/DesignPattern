package Proxy;

/**
 * Created by xdcao on 2017/9/1.
 */
public class ProxySearcher implements Searcher {

    private RealSearcher searcher=new RealSearcher();
    private AccessValidater validater;
    private Logger logger;

    @Override
    public String doSearch(String userID, String keyword) {
        if (validate(userID)){
            String result=searcher.doSearch(userID,keyword);
            this.log(userID);
            return result;
        }else{
            return null;
        }
    }

    public boolean validate(String userId){
        validater=new AccessValidater();
        return validater.validate(userId);
    }

    public void log(String userId){
        logger=new Logger();
        logger.log(userId);
    }


}
