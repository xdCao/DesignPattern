package Proxy;

/**
 * Created by xdcao on 2017/9/1.
 */
public class AccessValidater {

    public boolean validate(String userId){
        System.out.println("在数据库中验证用户"+userId+"是否为合法用户？");
        if (userId.equalsIgnoreCase("杨过")){
            System.out.println("'"+userId+"'登录成功！");
            return true;
        }else {
            System.out.println("'"+userId+"'登录失败");
            return false;
        }
    }

}
