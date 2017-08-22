package AbstractFactory;

import javax.xml.ws.FaultAction;

/**
 * Created by xdcao on 2017/8/22.
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory factory=null;
        factory=new SpringSkinFactory();
        factory.createButton().display();
        factory.createTextField().display();
        factory.createComboBox().display();
    }

}
