import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a)
	{
		System.out.println(a);
		return;
	}
	
	public static void toStringCombined(String a, String b)
	{
		System.out.println(a + " " + b);
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc= new Scanner(System.in);
	System.out.println("Write something");
	String hello= sc.nextLine();
	System.out.println("Write something else");
	String goodbye= sc.nextLine();

	toString(hello);
	toStringCombined(hello, goodbye);
	}
}
