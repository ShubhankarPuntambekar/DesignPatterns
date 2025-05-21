public class TransformerRobots implements RobotBuilder
{
    private Robot robot;


    public TransformerRobots()
    {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead()
    {
        robot.setRobotHead("Steel");
    }

    @Override
    public void buildRobotTorso()
    {
        robot.setRobotTorso("Steel torso");
    }

    @Override
    public void buildRobotArms()
    {
        robot.setRobotArms("Blowtorch Arm");
    }

    @Override
    public void buildRobotLegs()
    {
        robot.setRobotLegs("Dinasour legs");
    }

    @Override
    public Robot getRobot() {

        return this.robot;

    }
}
