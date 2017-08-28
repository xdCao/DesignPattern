package Component;

import java.rmi.Naming;

/**
 * Created by xdcao on 2017/8/28.
 */
public class ImageFile extends AbstractFile {

    private String file;

    public ImageFile(String file) {
        this.file = file;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("对图像文件"+ file +"进行杀毒");
    }
}
