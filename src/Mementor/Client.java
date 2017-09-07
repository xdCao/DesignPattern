package Mementor;

public class Client {

    public static void main(String[] args) {
        MementorCareTaker careTaker=new MementorCareTaker();
        Chessman chessman=new Chessman("车",1,1);
        display(chessman);
        careTaker.setChessmanMementor(chessman.save());
        chessman.setY(4);
        display(chessman);
        careTaker.setChessmanMementor(chessman.save());
        chessman.setX(5);
        display(chessman);
        System.out.println("悔棋");
        chessman.restore(careTaker.getChessmanMementor());
        display(chessman);

    }

    private static void display(Chessman chessman) {

        System.out.println("棋子: "+chessman.getLabel()+" 当前位置为: "+"第"+chessman.getX()+"行 ,第"+chessman.getY()+"列");

    }

}
