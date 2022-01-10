import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc= new Scanner(System.in);
	Random rand= new Random();
	
	System.out.println("Here are the Slot Machine Rules.");
	System.out.println("1. You will start out with $100.");
	System.out.println("2. Input the amount of money that you would like to wager.");
	System.out.println("3. The numbers will range from 1-10. Spin the machine and see if you can get 3 of a kind!.");
	System.out.println("	a. Your money will double if the slot machine rolls two of the same number.");
	System.out.println("	b. Your money will triple if the slot machine rolls three of the same number.");
	System.out.println("	c. You will lose all you money if none of the numbers match.");
	
	
	int coins= 100;
	boolean lose= coins <= 0;
		
	while(coins > 0)
	{
		System.out.println("Would you like to play a game? (No/no/N/n/Yes/yes/Y/y)");
		String answer= sc.nextLine();
		
			if(answer.equals("yes") || answer.equals("Yes") || answer.equals("Y") || answer.equals("y"))
		{
			System.out.println("You must enter the amount you want to wager. You have $" +coins+ " coins. Spend them wisely!");
			int wager= sc.nextInt();
			sc.nextLine();
				int rand_1= rand.nextInt(10) + 1;
				int rand_2= rand.nextInt(10) + 1;
				int rand_3= rand.nextInt(10) + 1;
				System.out.println(" | " + rand_1 + " | " + " | " + rand_2 + " | " + " | " + rand_3 + " | ");
			
			if(rand_1==rand_2 && rand_2==rand_3)
			{
				coins= coins*3;
				System.out.println("Congratulations! You've hit the jackpot. You're money is now tripled.");
			}
		else if(rand_1==rand_2 && rand_1 != rand_3 && rand_2 != rand_3)
			{
				coins= coins*2;
				System.out.println("Congratulations! You're money has been doubled!");
			}
		else if(rand_1==rand_3 && rand_1 != rand_2 && rand_2 != rand_3)
			{
				coins= coins*2;
				System.out.println("Congratulations! You're money has been doubled!");
			}
		else if(rand_2==rand_3 && rand_1 != rand_2 && rand_1 != rand_3)
			{
				coins= coins*2;
				System.out.println("Congratulations! You're money has been doubled!");
			}
		else if(coins <= 0)
			{
				System.out.println("You have no money left. :(");
				break;
			}
		else
			{
			System.out.println("Oh no! You've lost the lab you wagered. Try again.");
				coins= coins - wager;
			}
			
			System.out.println("You have $" + coins + ".");
		}
		else if(answer.equals("no") || answer.equals("No") || answer.equals("N") || answer.equals("n"))
		{
			System.out.println("Please play the game :(");
			break;
		}
		else if(answer.equals(answer))
		{
			System.out.println("Please input something else.");
			break;
		}
		
	}
		// you have to make sure everything you want repeated is inside the while loop

	}

}