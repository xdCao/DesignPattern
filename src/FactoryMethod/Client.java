package FactoryMethod;

/**
 * Created by xdcao on 2017/8/21.
 */
public class Client {


    public static void main(String[] args) {
//        LoggerFactory loggerFactory;
//        loggerFactory=new FileLoggerFactory();
//        Logger logger;
//        logger=loggerFactory.createLogger();
//        logger.writeLog();

        LoggerFactory factory=(LoggerFactory) XmlUtil.getBean();
        factory.createLogger().writeLog();

    }

}
