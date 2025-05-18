public class FarmHousePizzaFactory implements PizzaFactory
{
    //lets subclasses define  decide which class to instantiate..

    @Override
    public Pizza createNewPizza() {
        return new FarmHousePizza();
    }
}
