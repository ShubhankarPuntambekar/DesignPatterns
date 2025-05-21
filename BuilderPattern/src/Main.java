public class Main
{
    public static void main(String[] args)
    {
       RobotBuilder transformers = new TransformerRobots();
       RobotEngineer robotEngineer = new RobotEngineer(transformers);

       robotEngineer.buildRobot();

       Robot myRobot = robotEngineer.getRobot();

       System.out.println("Robot Built");
       System.out.println("Head : " + myRobot.getHead());
       System.out.println("Torso : " + myRobot.getTorso());
       System.out.println("Arms : " + myRobot.getArms());
       System.out.println("Legs : " + myRobot.getLegs());
    }
}