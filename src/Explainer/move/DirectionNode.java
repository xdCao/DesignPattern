package Explainer.move;

/**
 * Created by xdcao on 2017/9/4.
 */
public class DirectionNode extends AbstractNode {

    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if (direction.equalsIgnoreCase("up")){
            return "向上";
        }else if (direction.equalsIgnoreCase("down")){
            return "向下";
        }else if (direction.equalsIgnoreCase("left")){
            return "向左";
        }else if (direction.equalsIgnoreCase("right")){
            return "向右";
        }else {
            return "无效指令";
        }
    }
}
