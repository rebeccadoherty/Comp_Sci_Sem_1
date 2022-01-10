package pkg;
import java.util.Scanner;
import java.util.Random;


public class Consecutive 
{
	public static void consecutive(int rat[], int x)
		{
			for(int a= 0; a < rat.length - 1; a++)
			{
				if (rat[a] == rat[a + 1])
				{
				System.out.println("The indexes are " + a + " and " + (a + 1) + " and the consecutively repeated number is " + rat[a]);
				}
			}
			return;
		}
}

