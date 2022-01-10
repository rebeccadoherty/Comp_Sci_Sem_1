import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("What is your name brave soldier?");
		String name= sc.nextLine();
		System.out.println("What is your title?");
		String title= sc.nextLine();
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?");
		String choose= sc.nextLine();
		
		System.out.println("You have 25 points to spend on the following stats.");
		
	
		
		System.out.println("Choose a value between 1-10 that will determine your Strength. This will allow you to carry larger items.");
		int strength= sc.nextInt();
			boolean error1= strength > 10;
	
		if (error1)
		
		{
			System.out.println("Your value is over 10. Please input a value smaller than 10. How many points will you spend on strength?");
			int strength2= sc.nextInt();
		}
		
		System.out.println("Choose a value between 1-10 that will determine your Dexterity. This will allow you to increase your agility and speed.");
		int dexterity= sc.nextInt();
			boolean error2= dexterity > 10;
	
		if (error2)
		
		{
			System.out.println("Your value is over 10. Please input a value smaller than 10. How many points will you spend on dexterity?");
			int dexterity2= sc.nextInt();
		}
		
		System.out.println("Choose a value between 1-10 that will determine your Intelligence. A higher Intelligence will improve your ability to cast magic spells.");
		int intelligence= sc.nextInt();
			boolean error3= intelligence > 10;
	
		if (error3)
		
		{
			System.out.println("Your value is over 10. Please input a value smaller than 10. How many points will you spend on intelligence?");
			int intelligence2= sc.nextInt();
		}
		
		System.out.println("Choose a value between 1-10 that will determine your Constitution. More Constitution will increase your health.");
		int constitution= sc.nextInt();
			boolean error4= constitution > 10;
	
		if (error4)
		
		{
			System.out.println("Your value is over 10. Please input a value smaller than 10. How many points will you spend on constitution?");
			int constitution2= sc.nextInt();
		}
		
		System.out.println("Choose a value between 1-10 that will determine your Charisma. Choosing more Charisma will make you more personable.");
		int charisma= sc.nextInt();
			boolean error5= charisma > 10;
		
		if (error5)
		
		{
			System.out.println("Your value is over 10. Please input a value smaller than 10. How many points will you send on charisma?");
			int charisma2= sc.nextInt();
		}
		
		int points= 25 - (strength + dexterity + intelligence + constitution + charisma);
		boolean error6= points < 0;
		if (error6)
		
		{
			System.out.println("Your total stats are over 25 points. Please start over and spend no more than 25 points.");
		}
		
		System.out.println("You have "+points+" points left.");
		
		System.out.println("You are "+name+", "+title+". These are your stats. Good luck!");
		System.out.println("Strength= "+strength+"");
		System.out.println("Dexterity= "+dexterity+"");
		System.out.println("Intelligence= "+intelligence+"");
		System.out.println("Constitution= "+constitution+"");
		System.out.println("Charisma= "+charisma+"");
		
	}
}
