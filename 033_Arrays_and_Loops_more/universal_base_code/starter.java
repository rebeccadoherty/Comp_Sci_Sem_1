import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand= new Random();
		int count= 0;
		int min= 100;
		int max= 1;
		int rand_array= rand.nextInt(199) + 51;
		int[] rat= new int[rand_array];
		
		while(count < rat.length)
		{
			int rand_num= rand.nextInt(99) + 1;
			rat[count]= rand_num;
			System.out.println(rat[count]);
			count= count + 1;
		}
		
		count= 0;
		while(count < rat.length)
		{
			if(rat[count] < min)
				{
					min= rat[count]; 
				}
			count= count + 1;
		}
		System.out.println("This is the minimum: " + min);
		
		count= 0;
		while(count < rat.length)
		{
			if(rat[count] > max)
				{
					max= rat[count]; 
				}
			count= count + 1;
		}
		System.out.println("This is the maximum: " + max);
		
		count= 0;
		int k= rat[count];
		while((count + 1) < rat.length)
		{
			k = k + rat[count + 1];
			count++;
		}
		System.out.println("The average is: " + k/rand_array);
		System.out.println("The number of elements is: " + rand_array);
		
	}
}
