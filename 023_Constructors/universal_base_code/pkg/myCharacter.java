package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter
	{
	public String role;

	public myCharacter() 
		{
		role= "No role";
		}
		
	public myCharacter(String a)
		{
		role= a;
	
		if(role.equals("Wizard"))
			{
				System.out.println("Your healing magic will save many lives.");
				System.out.println("Your strength is 0");
				System.out.println("Your intelligence is 0");
				System.out.println("Your charisma is 0");
				System.out.println("Your constitution is 0");
				System.out.println("Your dexterity is 0");
			}
	
		else if(role.equals("Warrior"))
			{
				System.out.println("Shinzou sasageyo!");
				System.out.println("Your strength is 0");
				System.out.println("Your intelligence is 0");
				System.out.println("Your charisma is 0");
				System.out.println("Your constitution is 0");
				System.out.println("Your dexterity is 0");
			}
	
		else if(role.equals("Rogue"))
			{
				System.out.println("You have committed high treason against the King of Eldia! Prepare to die!");
				System.out.println("Your strength is 0");
				System.out.println("Your intelligence is 0");
				System.out.println("Your charisma is 0");
				System.out.println("Your constitution is 0");
				System.out.println("Your dexterity is 0");
			}
	
		else if(role.equals("WIZARD"))
			{
				System.out.println("Your healing magic will save many lives.");
				System.out.println("Your strength is 0");
				System.out.println("Your intelligence is 0");
				System.out.println("Your charisma is 0");
				System.out.println("Your constitution is 0");
				System.out.println("Your dexterity is 0");
			}
		
		else if(role.equals("WARRIOR"))
			{	
				System.out.println("Shinzou sasageyo!");
				System.out.println("Your strength is 0");
				System.out.println("Your intelligence is 0");
				System.out.println("Your charisma is 0");
				System.out.println("Your constitution is 0");
				System.out.println("Your dexterity is 0");
			}
	
		else if(role.equals("ROGUE"))
			{
				System.out.println("You have committed high treason against the King of Eldia! Prepare to die!");
				System.out.println("Your strength is 0");
				System.out.println("Your intelligence is 0");
				System.out.println("Your charisma is 0");
				System.out.println("Your constitution is 0");
				System.out.println("Your dexterity is 0");
			}

		else
			{
				System.out.println("Please choose one of the aformentioned options. :)");
			}

		}
	}
