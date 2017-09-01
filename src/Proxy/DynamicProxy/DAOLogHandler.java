package Proxy.DynamicProxy;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by xdcao on 2017/9/1.
 */
public class DAOLogHandler implements InvocationHandler {

    private Calendar calendar;
    private Object object;

    public DAOLogHandler() {
    }

    public DAOLogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result=method.invoke(object,args);
        afterInvoke();
        return result;
    }

    public void beforeInvoke(){
        calendar=new GregorianCalendar();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
        String time=hour+":"+minute+":"+second;
        System.out.println("调用时间"+time);
    }

    public void afterInvoke(){
        System.out.println("方法调用结束");
    }


}
