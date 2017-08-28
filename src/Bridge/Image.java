package Bridge;

/**
 * Created by xdcao on 2017/8/28.
 */
public abstract class Image {

    protected ImageImp imageImp;

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract void parseFile(String fileName);

}
