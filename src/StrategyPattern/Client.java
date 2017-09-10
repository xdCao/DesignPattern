package StrategyPattern;

public class Client {

    public static void main(String[] args) {
        MovieTicket mt=new MovieTicket();
        double originPrice=60.0;
        double currentPrice;

        mt.setPrice(originPrice);
        System.out.println("原始价为: "+originPrice);
        System.out.println("-------------------------");

        Discount discount;
        discount=new StudentDiscount();
        mt.setDiscount(discount);

        currentPrice=mt.getPrice();
        System.out.println("折后价为: "+currentPrice);



    }

}
