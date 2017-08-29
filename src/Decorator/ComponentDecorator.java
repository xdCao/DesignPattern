package Decorator;

/**
 * Created by xdcao on 2017/8/29.
 */
public class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
