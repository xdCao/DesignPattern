package Bridge;

import com.sun.org.apache.bcel.internal.generic.IADD;

/**
 * Created by xdcao on 2017/8/28.
 */
public class Client {

    public static void main(String[] args) {
        Image image=new BmpImage();
        image.setImageImp(new WindowsImp());
        image.parseFile("hahahah");
    }

}
