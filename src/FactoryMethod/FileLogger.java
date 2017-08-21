package FactoryMethod;

/**
 * Created by xdcao on 2017/8/21.
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
