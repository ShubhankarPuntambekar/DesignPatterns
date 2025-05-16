public class Bird extends Animal
{
    public Bird()
    {
        super();
        setName("Birdy");

        //Burying the implementation of the abstracted behavior inside the derived class.
        //Therefore bird can fly is specified here.
        setFlyingAbility(new CanFly());
    }



}
