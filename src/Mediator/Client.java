package Mediator;

public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator=new ConcreteMediator();
        Button addBT=new Button();
        List list=new List();
        ComboBox cb=new ComboBox();
        TextBox usernameTB=new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        usernameTB.setMediator(mediator);

        mediator.addButton=addBT;
        mediator.list=list;
        mediator.comboBox=cb;
        mediator.userNameTextBox=usernameTB;

        addBT.changed();

        System.out.println("-------------------------------");

        list.changed();



    }

}
