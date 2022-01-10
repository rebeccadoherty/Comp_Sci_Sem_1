import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter a word.");
		String response= sc.nextLine();
		int count= 0;
		
		for(count= 0;count < response.length(); count++)
		{
		System.out.println(response.substring(count, (count + 1)));
		}

	}
}
