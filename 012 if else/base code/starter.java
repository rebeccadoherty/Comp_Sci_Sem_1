import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("What number am I thinking of?");
		int a= sc.nextInt();
		Random rand= new Random();
		int rand_num1= rand.nextInt(1000);
		boolean correct_num= rand_num1==a;
		
		System.out.println(rand_num1);
		
		if (correct_num)
		{
			System.out.println("You guessed the correct number!");
		}
		else
		{
			System.out.println("You guessed the wrong number. Try again!");
		}
		

	}
}
