import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
	String choose= sc.nextLine();
	
	if(choose.equals("Wizard"))
	{
		System.out.println("Your healing magic will save many lives.");
	}
	
	else if(choose.equals("Warrior"))
	{
		System.out.println("Shinzou sasageyo!");
	}
	
	else if(choose.equals("Rogue"))
	{
		System.out.println("You have committed high treason against the King of Eldia! Prepare to die!");
	}
	
	else if(choose.equals("WIZARD"))
	{
		System.out.println("Your healing magic will save many lives.");
	}
		
	else if(choose.equals("WARRIOR"))
	{	
		System.out.println("Shinzou sasageyo!");
	}
	
	else if(choose.equals("ROGUE"))
	{
		System.out.println("You have committed high treason against the King of Eldia! Prepare to die!");	
	}
	
	else if(choose.equals(""+choose+""))
	
	{
		System.out.println("Please choose one of the aformentioned options. :)");
	}
	
	}
}
