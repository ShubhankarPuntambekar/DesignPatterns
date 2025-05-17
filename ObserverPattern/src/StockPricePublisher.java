import java.util.ArrayList;

public class StockPricePublisher implements Publisher
{
    private ArrayList<Subscriber> subs;
    private double titanPrice;
    private double asianPaints;
    private double tataInvest;

    public StockPricePublisher()
    {
        subs = new ArrayList<>();
    }


    @Override
    public void register(Subscriber sub)
    {
        subs.add(sub);
        System.out.println("Subscriber registered successfully");
    }

    @Override
    public void unregister(Subscriber sub)
    {
        subs.remove(sub);
        System.out.println("Subscriber de-registered successfully");


    }

    @Override
    public void notifySubscribers()
    {
        for(Subscriber subscriber : subs)
        {
            subscriber.update(titanPrice,asianPaints,tataInvest);
        }
    }


    public void setTitanPrice(double titanPrice)
    {
        this.titanPrice = titanPrice;
        notifySubscribers();
    }

    public void setAsianPaints(double asianPaints)
    {
        this.asianPaints = asianPaints;
        notifySubscribers();
    }

    public void setTataInvest(double tataInvest)
    {
        this.tataInvest = tataInvest;
        notifySubscribers();
    }
}
