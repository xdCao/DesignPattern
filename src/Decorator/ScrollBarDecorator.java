package Decorator;

/**
 * Created by xdcao on 2017/8/29.
 */
public class ScrollBarDecorator extends ComponentDecorator {


    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void setScrollBar(){
        System.out.println("为构件增加滚动条");
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }
}
