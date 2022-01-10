import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc= new Scanner(System.in);
	System.out.println("Please input a name to be repeated.");
	String name= sc.nextLine();
	System.out.println("Please input the number of times you wish the name to be repeated.");
	int num_repeat= sc.nextInt();
	int a= 1;

	while(true)
	{
		System.out.println(name);
			
			if(a==num_repeat)
			{
				break;
			}
			a= a + 1;
			}

		
	}
}
