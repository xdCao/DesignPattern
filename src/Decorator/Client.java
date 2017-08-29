package Decorator;

/**
 * Created by xdcao on 2017/8/29.
 */
public class Client {

    public static void main(String[] args) {
        Component component,componentSB;
        component=new Window();
        componentSB=new ScrollBarDecorator(component);
        componentSB.display();
    }

}
