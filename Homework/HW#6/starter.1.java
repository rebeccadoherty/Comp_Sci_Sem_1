import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static boolean checkPrime(int a)
	{
		int c= 2;
	
		while(c < a)
		{
				if (a % c == 0)
				{
					return false;
				}
				c= c + 1;
		}
	
					return true;
		
	}
	
	
	public static void printPrimes(int b)
	{
		
		int d= 2;
		
		while(d <= b)
		{
			if(checkPrime(d))
			{
				System.out.println(d);
			}
			
			if(d == b)
			{
				break;
			}
			d= d + 1;
		}
		
		return;
		
	}
	
	
	public static void main(String args[]) 
	{
		// Your code goes below here

	Scanner sc= new Scanner(System.in);
	System.out.println("Please input a number.");
	int input= sc.nextInt();
	
	// System.out.println(checkPrime(input));
	
	printPrimes(input);
	}
}
