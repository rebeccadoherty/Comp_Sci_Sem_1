import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your first name?");
		String text = sc.nextLine();
		System.out.println("What is your age?");
		int number = sc.nextInt();
		System.out.println("What is your birthday month?");
		int number1 = sc.nextInt();
		System.out.println("What is the day of your birth?");
		int number2 = sc.nextInt();
		System.out.println("What is your birthday year?");
		int number3 = sc.nextInt();
		System.out.println("How much is a buck fifty?");
		double number4 = sc.nextDouble();
		
		System.out.println("Your first name is "+text+"");
		System.out.println("Your age is "+number+"");
		System.out.println("Your birthday month is "+number1+"");
		System.out.println("The day of your birth is "+number1+"/"+number2+"");
		System.out.println("The year of your birth is "+number3+"");
		System.out.println("A buck fifty is "+number4+"");
	
	}
}
