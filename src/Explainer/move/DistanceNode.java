package Explainer.move;

/**
 * Created by xdcao on 2017/9/4.
 */
public class DistanceNode extends AbstractNode {

    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return distance;
    }
}
