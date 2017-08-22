package Prototype;

import java.util.Hashtable;

/**
 * Created by xdcao on 2017/8/22.
 */
public class PrototypeManager {

    private Hashtable ht=new Hashtable();
    private static PrototypeManager pm=new PrototypeManager();

    private PrototypeManager() {
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }

    public void addOfficialDoc(String key,OfficialDoc doc){
        ht.put(key,doc);
    }

    public OfficialDoc getOfficialDoc(String key){
        return ((OfficialDoc) ht.get(key)).clone();
    }

    public static PrototypeManager getInstance(){
        return pm;
    }

}
