package Builder;

import javax.accessibility.AccessibleValue;

/**
 * Created by xdcao on 2017/8/23.
 */
public abstract class ActorBuilder {

    protected Actor actor=new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor(){
        return actor;
    }


}
