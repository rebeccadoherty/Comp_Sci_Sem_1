import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		myCharacter test = new myCharacter();
		System.out.println("Your role is: " + test.role);
		System.out.println("Your dexterity is: " + test.dexterity);
		System.out.println("Your intelligence is: " + test.intelligence);
		System.out.println("Your charisma is: " + test.charisma);
		System.out.println("Your constitution is: " + test.constitution);
		System.out.println("Your strength is: " + test.strength);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Please choose Wizard, Rogue, or Warrior.");
		String role2= sc.nextLine();
		test.setRole(role2);
		


		
	}
}
