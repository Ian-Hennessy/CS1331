public class GroceryShopping
{
    public static void main(String[] args)
    {
        double bananaCost = 3.99;
        double applesCost = 1.25;
        int numApples = 4;
        double couponValue = 0.53;
        double taxRate = 0.08;
        double orderTotal = 0.0;
        orderTotal += (bananaCost / 2);
        orderTotal += applesCost * numApples;
        orderTotal -= (couponValue * 3);
        orderTotal *= (taxRate + 1);
        int orderPreTrunk = (int) orderTotal * 100;
        double orderTotalTrunc = orderPreTrunk/100;
        System.out.println("Your order total is $" + orderTotalTrunc + ".");
        int dollars = 10;
        dollars -= orderTotalTrunc;
        System.out.println("You have " + dollars + " dollar bills remaining.");
    }
}