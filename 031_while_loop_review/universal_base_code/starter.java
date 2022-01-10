import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Random rand= new Random();
	int i= 0;
		
	while (true)
	{
		int rat= rand.nextInt(99) + 1;
		System.out.println(rat);
		
		if(i == 100)
		{
			break;
		}
		i= i + 1;
	}
	System.out.println(i);
		
	}
}
