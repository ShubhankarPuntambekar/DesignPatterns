public class StockPriceSubscriberOne implements Subscriber
{
    private double titanPrice;
    private double asianPaints;
    private double tataInvest;

    private StockPricePublisher publisher;

    public StockPriceSubscriberOne(StockPricePublisher publisher)
    {
        this.publisher = publisher;
        publisher.register(this);
    }


    @Override
    public void update(double titanPrice, double asianPaints, double tataInvest)
    {
        this.titanPrice = titanPrice;
        this.asianPaints = asianPaints;
        this.tataInvest = tataInvest;

        displayPrices();
    }

    private void displayPrices()
    {
        System.out.println("TitanPrice : "+
                titanPrice +
                " AsianPaints "+
                asianPaints +
                " TataInvets "+ tataInvest);
    }
}
