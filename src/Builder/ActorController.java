package Builder;

/**
 * Created by xdcao on 2017/8/23.
 */
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder){
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildCostume();
        actorBuilder.buildFace();
        actorBuilder.buildHairstyle();
        actorBuilder.buildSex();
        actor=actorBuilder.createActor();
        return actor;
    }


}
