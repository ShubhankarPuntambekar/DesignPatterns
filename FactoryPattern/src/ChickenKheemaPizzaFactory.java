public class ChickenKheemaPizzaFactory implements PizzaFactory
{
    //lets subclasses define  decide which class to instantiate..

    @Override
    public Pizza createNewPizza() {
        return new ChickenKheemaPizza();
    }
}
