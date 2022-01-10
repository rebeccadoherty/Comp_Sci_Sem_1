import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
Scanner sc= new Scanner(System.in);
System.out.println("Enter a value for a.");
int a= sc.nextInt();
System.out.println("Enter a value for b.");
int b= sc.nextInt();
System.out.println(a);
System.out.println(b);

boolean c= a!=b;

if (c)
{
  System.out.println("The values of a and b are not equal to each other.");
}

if (a==b)
{
  System.out.println("These values are actually equal to each other.");
}
	
	}
}
