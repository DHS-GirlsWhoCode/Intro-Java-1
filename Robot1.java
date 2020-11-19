import becker.robots.*;

/**
 * Our first time using Becker's robots - get the robot to go into the closed
 * off section, take the thing, turn around, and stop one space out of the
 * enclosure.
 */
public class Robot1 extends java.lang.Object
{
    public static void main(String[] args)
    {
        // this is construction code - don't worry about it for now :)
        City theCity = new City();
        // our robot! his name is bob
        Robot bob = new Robot(theCity, 4, 3, Direction.NORTH, 0);
        Thing theThing = new Thing(theCity, 2, 3);
        // our walls
        new Wall(theCity, 2, 3, Direction.NORTH);
        new Wall(theCity, 2,3, Direction.EAST);
        new Wall(theCity, 2,3,Direction.WEST);
        
        // our objective - navigate bob into the space and out
        // TODO - write code that will get Bob into the space, pick up the Thing, and get out.
    }
    
}
