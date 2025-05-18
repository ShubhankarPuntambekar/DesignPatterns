public class HalfNHalfPizza implements Pizza
{
    @Override
    public void crustType()
    {
        System.out.println("Crust Type : Cheesy");
    }

    @Override
    public void toppings()
    {
        System.out.println(" Veg side : Mushrooms,tomatoes,Capsicum,jalapenos,olives,onions");
        System.out.println(" Non-Veg side : tomatoes,BBQ chicken,kheema");
    }

    @Override
    public void bake()
    {
        System.out.println("Medium bake till cheese milt");
    }

    @Override
    public void cut()
    {
        System.out.println("6 triangles a pizza");
    }

    @Override
    public void box()
    {
        System.out.println("Box it hot");
    }
}
