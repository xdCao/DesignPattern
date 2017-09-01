package Proxy.DynamicProxy;

/**
 * Created by xdcao on 2017/9/1.
 */
public class UserDao implements AbstractUserDao {
    @Override
    public boolean findUserByid(String userId) {
        if (userId.equalsIgnoreCase("张无忌")){
            System.out.println("查询用户Id为"+userId+"的用户信息成功！");
            return true;
        }else {
            System.out.println("查询Id为"+userId+"的用户信息失败！");
            return false;
        }
    }
}
