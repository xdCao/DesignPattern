package Builder;

/**
 * Created by xdcao on 2017/8/23.
 */
public class Client {

    public static void main(String[] args) {
        ActorController actorController=new ActorController();
        Actor actor = actorController.construct(new DevilBuilder());
        System.out.println(actor);
    }


}
