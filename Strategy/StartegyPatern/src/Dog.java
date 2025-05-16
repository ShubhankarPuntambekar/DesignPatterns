public class Dog extends Animal
{
    public Dog()
    {
        super();
        setName("Jack");

        //Burying the implementation of the abstracted behavior inside the derived class.
        //Therefore dog cannot fly is specified here.
        setFlyingAbility(new CantFly());
    }


}
