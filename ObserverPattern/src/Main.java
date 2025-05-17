public class Main
{
    public static void main(String[] args)
    {
        StockPricePublisher pub = new StockPricePublisher();
        StockPriceSubscriberOne sub = new StockPriceSubscriberOne(pub);

        pub.setAsianPaints(1000);
        pub.setTataInvest(6000);
        pub.setTitanPrice(4000);

    }
}