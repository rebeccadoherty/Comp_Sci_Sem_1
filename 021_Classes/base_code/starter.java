import java.util.Scanner;
import java.util.Random;

class Character
{
	String role;
	int dexterity;
	int charisma;
	int strength;
	int constitution;
	int intelligence;
	
	public Character()
	{
		role= "Wizard";
		dexterity= 5;
		strength= 5;
		intelligence= 5;
		charisma= 5;
		constitution= 5;
	}
	
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
	Character character= new Character();
	System.out.println("Your role is " + character.role);
	System.out.println("Your dexterity is " + character.dexterity);
	System.out.println("Your intelligence is " + character.intelligence);
	System.out.println("Your strength is " + character.strength);
	System.out.println("Your constitution is " + character.constitution);
	System.out.println("Your charisma is " + character.charisma);
		
	}
}