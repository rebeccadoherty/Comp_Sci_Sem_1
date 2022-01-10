import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose a number.");
		int number= sc.nextInt();
		int a= 0;
		
		while(true)
		{
			if(a == 5)
			{
				break;
			}
		
			System.out.println(number + a);
			a= a + 1;
			
		 // you have to write a= a + 1 after because if you had put it before then the counter is starting at 1 because the counter will add one before you out put your number
		 // you also have to keep your counter isolated becuase it is not the input you are adding one to, but the counter
			
		}
		
		// System.out.println("Choose another number.");
		// int number2= sc.nextInt();
		// int b= 0;
		
		// while(true)
		// {
		// 	if(b == 34)
		// 	{
		// 		break;
		// 	}
		// 	b= b + 1;
		// }
	
		
	}
}
