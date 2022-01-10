import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		myCharacter character= new myCharacter();
		System.out.println("Your role is" + character.role);
		System.out.println("Please input your role as either a Wizard, Rogue, or Warrior.");
		String character1= sc.nextLine();
		myCharacter character_1= new myCharacter(character1);
		System.out.println("Your role is " + character_1.role);

	
	}
}
