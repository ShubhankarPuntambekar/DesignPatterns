public class Animal
{
    private String name;

    //Encapsulating interface in the base class.
    public Fly flyingAbility;


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setFlyingAbility(Fly fly)
    {
        //dynamic polymorphism : Resolved at run time.
        flyingAbility = fly;
    }

    public String getFlyingAbility()
    {
        return flyingAbility.fly();
    }



}
