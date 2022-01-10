import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Random rand= new Random();
		Scanner sc= new Scanner(System.in);
		System.out.println("What number am I thinking of?");
		int guess= sc.nextInt();
		int rand_num1= rand.nextInt(1000);
		boolean correct_num= guess==rand_num1;
		boolean larger_than= guess>rand_num1;
		boolean less_than= guess<rand_num1;
		
		if (correct_num)
		{
			System.out.println("You guessed the right number! "+rand_num1+" = "+guess+"");
		}
		else if (larger_than)
		{
			System.out.println("You're number was larger then the generated number. Try again! "+guess+" > "+rand_num1+"");
		}
		else if (less_than)
		{
			System.out.println("You're number was less than the generated number. Try again! "+guess+" < "+rand_num1+"");
		}

		
	}
}
