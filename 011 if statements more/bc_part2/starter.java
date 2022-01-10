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
System.out.println("Enter a value for c.");
int c= sc.nextInt();


if ((a>b) && (a>c))
{
  System.out.println(+a+" is the largest value.");
}

if ((a<b) && (b>c))
{
  System.out.println(+b+" is the largest value.");
}
	
	if ((a<c) && (b<c))
	{
		System.out.println(+c+" is the largest value");
	}
	
	if ((a<c) && (a<b))
	{
		System.out.println(+a+" is the smallest value");
	}
	
	if ((b<a) && (b<c))
	{
		System.out.println(+b+" is the smallest value");
	}
	
	if ((c<a) && (c<b))
	{
		System.out.println(+c+" is the smallest value");
	}
	
	}
}
