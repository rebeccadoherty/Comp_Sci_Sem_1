import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc= new Scanner(System.in);
	System.out.println("Please input a number.");
	int num_1= sc.nextInt();
	int a= num_1 % 2;
	int c= num_1 % 3;
	int d= num_1 % 4;
	int e= num_1 % 5;
	
	if(a==0)
	{ 
		System.out.println("Your input value is even.");
	}
	else if(a==1)
	{
		System.out.println("Your input value is odd.");
	}
	
	if (c==0)
	{
		System.out.println("You input value is divisible by 3.");
	}
	else if(c!=0)
	{
		System.out.println("Your input value is not divisible by 3.");
	}
	
	if(d==0)
	{
		System.out.println("Your input value is divisible by 4.");
	}
	else if(d!=0)
	{
		System.out.println("Your input value is not divisible by 4.");
	}
	
	if(e==0)
	{
		System.out.println("Your input value is divisible by 5.");
	}
	else if(e!=0)
	{
		System.out.println("Your input value is not divisible by 5.");
	}
	
	System.out.println("Please input another number.");
	int num_2= sc.nextInt();
	int b= num_2 % 2;
	int f= num_2 % 3;
	int g= num_2 % 4;
	int h= num_2 % 5;
	
	if(b==0)
	{
		System.out.println("Your input value is even.");
	}
	else if(b==1)
	{
		System.out.println("Your input value is odd.");
	}
	
	if(f==0)
	{
		System.out.println("Your input value is divisible by 3.");
	}
	else if(f!=0)
	{
		System.out.println("Your input value is not divisible by 3.");
	}
	
	if(g==0)
	{
		System.out.println("Your input value is divisible by 4.");
	}
	else if(g!=0)
	{
		System.out.println("Your input value is not divisible by 4.");
	}
	
	if(h==0)
	{
		System.out.println("Your input value is divisible by 5.");
	}
	else if(h!=0)
	{
		System.out.println("Your input value is not divisible by 5.");
	}
		
	}
}
