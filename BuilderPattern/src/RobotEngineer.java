public class RobotEngineer
{
    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder)
    {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot()
    {
        return this.robotBuilder.getRobot();
    }

    public void buildRobot()
    {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotLegs();

    }


}
