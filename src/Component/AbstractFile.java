package Component;

/**
 * Created by xdcao on 2017/8/28.
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();


}
