public class Main
{
    public static void main(String[] args)
    {
        //Static polymorphism : derived at compile time
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Hi I am a dog, " + dog.getName() + " bho bho! " + dog.getFlyingAbility());

        System.out.println("Hi I am a little bird "+ bird.getName() + " chiu chiu, " + bird.getFlyingAbility());

    }
}