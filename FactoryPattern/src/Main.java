public class Main
{
    public static void main(String[] args)
    {
        PizzaFactory myPizzaOrder = new ChickenKheemaPizzaFactory();
        Pizza pizzaOrderPrep = myPizzaOrder.createNewPizza();
        pizzaOrderPrep.crustType();
    }
}