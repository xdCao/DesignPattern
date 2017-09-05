package Iterator;

import Command.Calculator.AbstractCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xdcao on 2017/9/5.
 */
public abstract class AbstractObjectList {

    protected List<Object> objects=new ArrayList<Object>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object object){
        this.objects.add(object);
    }

    public void removeObject(Object object){
        this.objects.remove(object);
    }

    public List getObjects(){
        return this.objects;
    }

    public abstract AbstractIterator createIterator();


}
