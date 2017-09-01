package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.logging.Handler;

/**
 * Created by xdcao on 2017/9/1.
 */
public class Client {

    public static void main(String[] args) {
        InvocationHandler  invocationHandler=null;
        AbstractUserDao userDao=new UserDao();
        invocationHandler=new DAOLogHandler(userDao);
        AbstractUserDao proxy=null;
        proxy=(AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(),new Class[]{AbstractUserDao.class},invocationHandler);
        proxy.findUserByid("张无忌");

        System.out.println("---------------------------------------------");

        AbstractDocumentDao documentDao=new DocumentDao();
        invocationHandler=new DAOLogHandler(documentDao);
        AbstractDocumentDao proxy1=null;
        proxy1= (AbstractDocumentDao) Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(),new Class[]{AbstractDocumentDao.class},invocationHandler);
        proxy1.deleteDocumentById("D002");



    }

}
