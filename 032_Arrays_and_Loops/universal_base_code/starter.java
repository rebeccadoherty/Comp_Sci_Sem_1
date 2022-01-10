import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Random rand= new Random();
	int count= 0;
	int[] rat= new int[1000];
		
	while(count < rat.length)
	{
		rat[count]= rand.nextInt(99) + 1;
		
		count= count + 1;
	}
		
	count= 0;	
	while(count < rat.length)
		{
			System.out.println(rat[count]);
			count= count + 1;
		}	
	}
}
