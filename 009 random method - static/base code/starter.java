import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	Random rand= new Random();
	int rand_num1= rand.nextInt(9);
	System.out.println("Value between 0 and 9: " + rand_num1);
	int rand_num2= rand.nextInt(99) + 1;
	System.out.println("Value between 1 and 100: " + rand_num2);
	double rand_num3= rand.nextDouble() + 2.5;
	System.out.println("Value between 2.5 and 3.5: " + rand_num3);
	double rand_num4= rand.nextDouble();
	int a = rand.nextInt(589);
	double b= rand_num4 + a + 14;
	System.out.println("Double value between 14 and 589: " + b);
	
	
	}
}
