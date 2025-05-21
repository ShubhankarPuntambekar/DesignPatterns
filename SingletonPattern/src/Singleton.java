public class Singleton
{

    //Static attribute of the single instance
    private static Singleton firstInstance;

    //private constructor
    private Singleton()
    {
        //This constructor makes the class self instantiating
    }

    //lazy initialization
    public static Singleton getInstance()
    {
        if(firstInstance == null)
        {
            firstInstance = new Singleton();
        }

        return firstInstance;
    }


}
