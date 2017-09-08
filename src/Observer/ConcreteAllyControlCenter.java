package Observer;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ConcreteAllyControlCenter extends AllyControlCenter {

    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName+"战队组件成功");
        System.out.println("--------------------------");
        this.allyName=allyName;
    }

    @Override
    public void notifyObserver(String name) {

            System.out.println(this.allyName+"战队紧急通知,盟友"+name+"遭受敌人攻击");
            for (Object object:players){
                if (!((Observer)object).getName().equalsIgnoreCase(name)){
                    ((Observer)object).help();
                }
            }

    }

}
