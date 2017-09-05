package Iterator;

/**
 * Created by xdcao on 2017/9/5.
 */
public interface AbstractIterator {

    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    Object getNextItem();
    Object getPreviousItem();

}
