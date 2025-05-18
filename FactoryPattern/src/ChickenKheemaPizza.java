public class ChickenKheemaPizza implements Pizza
{
    public void crustType()
    {
        System.out.println("Crust Type : Pan tossed");
    }

    @Override
    public void toppings()
    {
        System.out.println("BBQ chicken,kheema,tandoori sauce,sausages");
    }

    @Override
    public void bake()
    {
        System.out.println("High bake till dough rise");
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
