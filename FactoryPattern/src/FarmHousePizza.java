public class FarmHousePizza implements Pizza
{
    @Override
    public void crustType()
    {
        System.out.println("Crust Type : Thin");
    }

    @Override
    public void toppings()
    {
        System.out.println("Mushrooms,tomatoes,Capsicum,jalapenos,olives,onions");
    }

    @Override
    public void bake()
    {
        System.out.println("Light bake till leopard pattern");
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
