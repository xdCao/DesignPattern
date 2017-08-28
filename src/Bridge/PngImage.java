package Bridge;

/**
 * Created by xdcao on 2017/8/28.
 */
public class PngImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix=new Matrix();
        imageImp.doPaint(matrix);
        System.out.println(fileName+" ,格式为PNG");
    }
}
