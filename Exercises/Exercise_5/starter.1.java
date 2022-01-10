import java.util.Scanner;

class starter {
	
	
	public static int rat(int a, int b)
	{
		int c= a * b;
		int d= c % 3;
		if(d == 0)
		{
			return ("Your values are divisible by three after multipled together.");
		}
		else
		{
			return ("Your values are not divisible by three after multipled together.");
		}
	}
	// for classes, you can return this way to make it simpler
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Input a number.");
		int x= sc.nextInt();
		System.out.println("Input another number.");
		int y= sc.nextInt();
		System.out.println(rat(x,y));
	}
}
