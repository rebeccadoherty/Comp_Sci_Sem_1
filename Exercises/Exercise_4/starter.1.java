import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input a number.");
		int x= sc.nextInt();
		int c= x;
		int y= x;
		int counter= 1;
	
		while(true)
		{
			c= c-1;
			y= y * (c);
			
			if((x - 1) == counter)
				break;
			
		}
		counter= counter + 1;
		
			System.out.println(x);
	}
}
