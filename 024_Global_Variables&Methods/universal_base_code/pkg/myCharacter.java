package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter 
{
	public static String role;
	public static int dexterity;
	public static int strength;
	public static int charisma;
	public static int intelligence;
	public static int constitution;

	public static void myToString() 
	{
		dexterity= 0;
		charisma= 0;
		constitution= 0;
		intelligence= 0;
		strength= 0;
		System.out.println("Your role is rogue.");
		System.out.println("Your dexterity is: " + dexterity);
		System.out.println("Your charisma is: " + charisma);
		System.out.println("Your constitution is: " + constitution);
		System.out.println("Your intelligence is: " + intelligence);
		System.out.println("Your strength is: " + strength);
	
		return;
	}

}

