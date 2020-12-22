// your becker library should already be configured in your project
import becker.robots.*;

/**
 * <b>Goal</b> - use <em>while loops</em> to make moving our robot long distances faster
 */
public class WhileLoopsA extends java.lang.Object
{
    public static void main(String[] args)
    {
        // construction code
        City bigCity = new City();
        Robot quickRobot = new Robot(bigCity,1,1,Direction.SOUTH,20);
        int counter = 0;
        while (counter < 4)
        {
            quickRobot.putThing();
            quickRobot.move();
            counter++;
        }

    }
}
