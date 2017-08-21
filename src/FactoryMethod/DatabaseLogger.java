package FactoryMethod;

/**
 * Created by xdcao on 2017/8/21.
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
