/* My name is Ian Hennessy, and my fun fact is that 
I would love to work on engine software for porsche in 
the future */

public class Speedometer
{
	public static void main(String[] args)
	{
		int kilometers = 50;
		double kmPerMile = 1.60934;
		double hours = 0.54;
		String name = "Ian Hennessy";
		double miles = kilometers/kmPerMile;
		int preTrunc = (int) miles * (1000);
		double milesTrunc = preTrunc/1000;
		double rawSpeed = milesTrunc/hours;
		int spPreTrunc = (int) rawSpeed * 100;
		double speed = spPreTrunc/100;
		System.out.println(name + " drove at a speed of " + speed + " mph for " + milesTrunc + " miles!");
	}
}