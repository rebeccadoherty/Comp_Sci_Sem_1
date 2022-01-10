import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input your full name.");
		String response= sc.nextLine();
		System.out.println(response.indexOf(" "));
		System.out.println(response.substring(response.indexOf(" ") + 1));
	}
}
