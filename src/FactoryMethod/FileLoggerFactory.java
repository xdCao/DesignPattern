package FactoryMethod;

/**
 * Created by xdcao on 2017/8/21.
 */
public class FileLoggerFactory implements LoggerFactory{


    @Override
    public Logger createLogger() {
        Logger logger=new FileLogger();
        return logger;
    }
}
