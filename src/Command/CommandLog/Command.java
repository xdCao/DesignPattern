package Command.CommandLog;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.Serializable;

/**
 * Created by xdcao on 2017/9/3.
 */
public abstract class Command implements Serializable{

    protected String name;
    protected String args;
    protected ConfigOperator configOperator;//接收者对象引用

    public Command(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public abstract void execute(String args);
    public abstract void execute();

}
