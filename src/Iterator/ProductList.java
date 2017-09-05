package Iterator;

import java.util.List;

/**
 * Created by xdcao on 2017/9/5.
 */
public class ProductList extends AbstractObjectList {


    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }


}
