/**
 * A program where we calculate the cost of a meal INCLUDING the 15% tip.
 */
public class Tipping
{
    public static void main(String[] args)
    {
        // we've INSTANTIATED an integer variable and assigned it the value of 2.
        int costOfMeal = 5;
        // say we want to tip our waiter 15% of our meal price.
        double costOfTip = costOfMeal * 0.15;
        // make our total price the combination of the tip and meal cost.
        double totalPrice = costOfMeal + costOfTip;
        System.out.println("Total price of the meal is $" + totalPrice);
    }
}
