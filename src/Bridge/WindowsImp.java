package Bridge;

/**
 * Created by xdcao on 2017/8/28.
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在windows中显示图像");
    }
}
