package Observer;

public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void help() {
        System.out.println("坚持住,"+this.name+"来救你");
    }

    @Override
    public void beAttached(AllyControlCenter acc) {
        System.out.println(this.name+"被攻击");
        acc.notifyObserver(name);
    }
}
