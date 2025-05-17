public interface Publisher
{
    public void register(Subscriber sub);
    public void unregister(Subscriber sub);
    public void notifySubscribers();
}
