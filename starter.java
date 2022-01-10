import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input a phrase.");
		String response= sc.nextLine();
		String letter= "";
		for(int x= 0; x < response.length(); x++)
			letter= response.substring(x, x + 1);
			{
				System.out.println(response.indexOf(" "));
			}
	
		System.out.println(response.substring(response.indexOf(" ") + 1));
		
	}
}
