import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc= new Scanner(System.in);
	Random rand= new Random();
	System.out.println("Please pick a number between 1 and 1000.");
	int guess= sc.nextInt();
	int secret#= 1 + rand.nextInt(1000);
	int a= 0;
	
	while(true)
	{
		if(guess < secret#)
		{
			System.out.println("Your number was too low. Please input another number.");
			guess= sc.nextInt();
		}
		
		else if(guess > secret#)
		{
			System.out.println("Your number was too high. Please input another number.");
			guess= sc.nextInt();
		}
		
		else if(guess == secret#)
		{
			System.out.println("Congratulations! You guessed the correct number.");
			break;
		}
	
		a=a+1;
	}

		
	}
}
