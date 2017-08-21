package FactoryMethod;

/**
 * Created by xdcao on 2017/8/21.
 */
public class DatabaseLoggerFactory implements LoggerFactory{


    @Override
    public Logger createLogger() {
        Logger logger=new DatabaseLogger();
        return logger;
    }
}
