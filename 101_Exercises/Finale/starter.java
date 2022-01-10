import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static int getMode(int[] x)
	{
		while(0 > x.length)
		{
			for(count= 0; count < rat.length; count++)
		{
			if(rat[count] == rat[count + 1])
			{
				for(int j= count + 1; j < rat.length; j++)
				{
					if(rat[count] == rat[j])
					{
					System.out.println("the mode is " + rat[count]);
					}
				}
			}
		}
		}
	}
	
	public static int getMedian(int[] y)
	{
		while(0 > y.length)
		{
			int median= y.length/2;
			System.out.println("the median is " + y[median]);
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Hangman test = new Hangman();

	
		
	}
}
