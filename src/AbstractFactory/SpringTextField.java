package AbstractFactory;

import javax.xml.soap.Text;

/**
 * Created by xdcao on 2017/8/22.
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
