package Mediator;

public class SubConcreteMediator extends ConcreteMediator {

    public Label label;

    @Override
    public void componentChanged(Component c) {
        super.componentChanged(c);
        if (c==addButton){
            label.update();
        }
    }
}
