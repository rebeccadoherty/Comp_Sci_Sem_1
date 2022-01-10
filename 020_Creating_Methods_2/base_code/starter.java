import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b)
	{
		int c= a;
		int d= 1;
		while(d<b)
		{
			c= c*a;
			d++;
			//d++ also means d= d + 1;
			//if you input the values by hand, then you will see that you will get your answer and then the counter will hit the value of b, ending the while loop
		}
		return c;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
	
	Scanner sc= new Scanner(System.in);
	System.out.println("PLease input an integer.");
	int x= sc.nextInt();
	System.out.println("Please input another integer.");
	int y= sc.nextInt();
	System.out.println(pow(x,y));
		
	}
}
