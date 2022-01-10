import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) 
	{
		// Your code goes below here
		Random rand= new Random();
		Consecutive num= new Consecutive();
		int count2= 0;
		int rand_value2= rand.nextInt(9) + 1;
		int[] rat= new int[20];
		
		while((count2 < rat.length))
		{
			int rand_value= rand.nextInt(9) + 1;
			rat[count2]= rand_value;
			count2++;
		}
		
		num.consecutive(rat, rat.length);
		
	
		System.out.println("The target number is " + rand_value2);
		
		for(count2= 0; count2 < rat.length; count2++)
		{
			if(rat[count2] == rand_value2)
			{
				for(int j= count2 + 1; j < rat.length; j++)
				{
					if(rat[count2] == rat[j])
					{
					System.out.println("The are the index values are "  + count2 + " and " + j + " and the duplicated number is " + rand_value2);
					}
				}
			}
		}
		
		System.out.println(rat[0]);
		System.out.println(rat[1]);
		System.out.println(rat[2]);
		System.out.println(rat[3]);
		System.out.println(rat[4]);
		System.out.println(rat[5]);
		System.out.println(rat[6]);
		System.out.println(rat[7]);
		System.out.println(rat[8]);
		System.out.println(rat[9]);
		System.out.println(rat[10]);
		System.out.println(rat[11]);
		System.out.println(rat[12]);
		System.out.println(rat[13]);
		System.out.println(rat[14]);
		System.out.println(rat[15]);
		System.out.println(rat[16]);
		System.out.println(rat[17]);
		System.out.println(rat[18]);
		System.out.println(rat[19]);
				
		
	}
}
