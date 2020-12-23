import becker.robots.*;

/**
 * This <b>extends</b> the Robot class, meaning it is like a child class - it has all of the Robot
 * class's methods and whatever more we add to it.
 */
class AdvancedRobotA extends Robot
{
    // we define the constructor for AdvancedRobot objects. Don't worry about this too much
    AdvancedRobotA(City c, int st, int ave, Direction dir, int num)
    {
        super(c, st, ave, dir, num);
    }
    /**
     * A method that moves the Advanced Robot five spaces forward and leaves a trail of Things.
     **/
    public void moveFive()
    {
        // TODO - write a while loop that makes the robot move 5 spaces and leave a Thing on each square.
    }
}

public class DrawSquare extends Object
{
    public static void main(String[] args)
    {
        // construction code
        City bigCity = new City();
        AdvancedRobotA quickRobot = new AdvancedRobotA(bigCity,1,1,Direction.SOUTH,20);
        // TODO - use a while loop and the moveFive method to draw a 5 x 5 square.
    }
}
