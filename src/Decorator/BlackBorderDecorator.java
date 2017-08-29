package Decorator;

/**
 * Created by xdcao on 2017/8/29.
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void setBlackBorder(){
        System.out.println("为构件增加黑色边框");
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }
}
