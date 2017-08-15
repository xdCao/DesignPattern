package Singleton;

/**
 * Created by xdcao on 2017/8/7.
 */
public class Client {


    public static void main(String[] args) {
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1=LoadBalancer.getInstance();
        balancer2=LoadBalancer.getInstance();
        balancer3=LoadBalancer.getInstance();
        balancer4=LoadBalancer.getInstance();

        if (balancer1==balancer2&&balancer3==balancer4&&balancer2==balancer3){
            System.out.println("服务器负载均衡器具有唯一性");
        }

        balancer1.addServer("Server 1");
        balancer2.addServer("Server 2");
        balancer3.addServer("Server 3");

        for (int i=0;i<10;i++){
            String server=balancer1.getServer();
            System.out.println("请求分发至服务器： "+server);
        }

    }

}
